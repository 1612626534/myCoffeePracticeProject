package com.practice.action.user;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.practice.common.CoffeeMessage;
import com.practice.common.Constants;
import com.practice.service.user.UserService;
import org.activiti.engine.impl.persistence.entity.UserEntity;
import org.activiti.engine.impl.persistence.entity.UserEntityImpl;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * This class is used to read user info.
 */
public class UserAction extends ActionSupport implements ModelDriven<UserEntityImpl> {

    private UserEntityImpl userEntity = new UserEntityImpl();
    private InputStream inputStream;
    private UserService userService;
    private Logger logger = Logger.getLogger(UserAction.class);

    public String login() {
        UserEntity currentUser = null;
        logger.info("user email: " + userEntity.getEmail());
        logger.info("user password: " + userEntity.getPassword());
        if (!isCurrentUserLogin()) {
            try {
                currentUser = this.userService.getUser(this.userEntity.getEmail(), this.userEntity.getPassword());
                addCurrentUserToSession(currentUser);
                logger.info("current user info: " + currentUser.getEmail());
            } catch (NullPointerException e) {
                this.inputStream = convertObjectToStream(new CoffeeMessage(LOGIN, "Email/Password is incorrect."));
            }
        }
        return currentUser == null ? LOGIN : SUCCESS;
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

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public UserEntityImpl getModel() {
        return this.userEntity;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
