package com.action.user;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.bean.UserPO;
import com.common.CoffeeMessage;
import com.common.Constants;
import com.service.user.UserService;
import org.activiti.engine.impl.persistence.entity.UserEntity;

import org.apache.struts2.ServletActionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * This class is used to read user info.
 */
public class UserAction extends ActionSupport implements ModelDriven<UserPO> {

    private UserPO userEntity = new UserPO();
    private InputStream inputStream;

    @Autowired
    private UserService userService;
    private Logger logger = LoggerFactory.getLogger(UserAction.class);

    public String login() {
        this.logger.info("email: " + this.userEntity.getEmail() + " password: " + this.userEntity.getPassword());

        if (!isCurrentUserLogin()) {
            try {
                UserPO currentUser = this.userService.getUser(this.userEntity.getEmail(), this.userEntity.getPassword());
                logger.info("currentUser", currentUser);
                addCurrentUserToSession(currentUser);
                logger.info("current user info: " + currentUser.getEmail());
            } catch (NullPointerException e) {
                this.inputStream = convertObjectToStream(new CoffeeMessage(LOGIN, "Email/Password is incorrect"));
            }
        }

        this.inputStream = convertObjectToStream(new CoffeeMessage(SUCCESS, "Permission accepted by coffee"));
        return SUCCESS;
    }

    private boolean isCurrentUserLogin() {
        HttpSession session = ServletActionContext.getRequest().getSession();
        String currentUserEmail = (String) session.getAttribute(Constants.CURRENT_USER);
        boolean isCurrentUserEmailEmpty = StringUtils.isEmpty(currentUserEmail);
        boolean isCurrentLoginEmailEmpty = StringUtils.isEmpty(this.userEntity.getEmail());
        return !isCurrentUserEmailEmpty && !isCurrentLoginEmailEmpty && currentUserEmail.equals(this.userEntity.getEmail());
    }

    private void addCurrentUserToSession(UserEntity currentUser) {
        HttpSession session = ServletActionContext.getRequest().getSession();
        session.setAttribute(Constants.CURRENT_USER, currentUser.getEmail());
    }

    private InputStream convertObjectToStream(Object object) {
        Gson gson = new Gson();
        String coffeeMessage = gson.toJson(object);
        return new ByteArrayInputStream(coffeeMessage.getBytes());
    }

    public void setUserEntity(UserPO userEntity) {
        this.userEntity = userEntity;
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public UserPO getModel() {
        return this.userEntity;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


}
