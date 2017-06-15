package com.practice.action.user;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.practice.bean.UserPO;
import com.practice.common.Constants;
import org.activiti.engine.IdentityService;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpSession;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * This class is used to read user info.
 */
public class UserAction extends ActionSupport implements ModelDriven<UserPO> {

    private UserPO userPO;
    private InputStream inputStream;
    private IdentityService identityService;

    public String login() {

        HttpSession session = ServletActionContext.getRequest().getSession();
        session.setAttribute(Constants.CURRENT_USER, userPO.getId());

        Gson gson = new Gson();
        inputStream = new ByteArrayInputStream(("login sueccess: " + gson.toJson(userPO).toString()).getBytes());
        return SUCCESS;
    }

    public UserPO getModel() {
        return this.userPO;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public IdentityService getIdentityService() {
        return identityService;
    }

    public void setIdentityService(IdentityService identityService) {
        this.identityService = identityService;
    }
}
