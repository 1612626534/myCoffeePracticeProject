package com.action.user;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.bean.user.UserPO;
import com.common.CoffeeMessage;
import com.common.Constants;
import com.service.user.UserService;
import com.utils.IOUtils;

import org.apache.struts2.ServletActionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;
import java.io.InputStream;


/**
 * This class is used to read user info.
 */
public class UserAction extends ActionSupport implements ModelDriven<UserPO> {

    private UserPO userPO = new UserPO();
    private InputStream inputStream;

    @Autowired
    private UserService userService;
    private Logger logger = LoggerFactory.getLogger(UserAction.class);

    public String login() {
        logger.info("login");

        try {
            UserPO currentUser = this.userService.getUser(this.userPO.getEmail(), this.userPO.getPassword());
            addCurrentUserToSession(currentUser);
            this.inputStream = IOUtils.convertObjectToStream(new CoffeeMessage(SUCCESS, "Permission accepted by coffee"));
            logger.info(this.userPO.getEmail() + "login smvnuccessfully.");
        } catch (NullPointerException e) {
            this.inputStream = IOUtils.convertObjectToStream(new CoffeeMessage(LOGIN, "Email/Password is incorrect"));
            logger.info(this.userPO.getEmail() + "login failed.");
        }

        return SUCCESS;
    }

    private void addCurrentUserToSession(UserPO currentUser) {
        HttpSession session = ServletActionContext.getRequest().getSession();
        session.setAttribute(Constants.CURRENT_USER, currentUser);
    }

    public void setUserEntity(UserPO userEntity) {
        this.userPO = userEntity;
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public UserPO getModel() {
        return this.userPO;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


}
