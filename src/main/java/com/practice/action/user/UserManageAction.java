package com.practice.action.user;

import com.opensymphony.xwork2.ModelDriven;
import com.practice.bean.UserPO;

/**
 * Thi class is used to manage user info, include /create/update/delete.
 */
public class UserManageAction implements ModelDriven<UserPO>{
    private UserPO userPO;

    public UserPO getModel() {
        return userPO;
    }
}
