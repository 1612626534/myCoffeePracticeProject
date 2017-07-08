package com.practice.action.user;

import com.opensymphony.xwork2.ModelDriven;
import com.practice.bean.UserPO;
import org.activiti.engine.impl.persistence.entity.UserEntityImpl;

/**
 * Thi class is used to manage user info, include /create/update/delete.
 */
public class UserManageAction implements ModelDriven<UserEntityImpl>{
    private UserEntityImpl userEntity;

    public UserEntityImpl getModel() {
        return userEntity;
    }
}
