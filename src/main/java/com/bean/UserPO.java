package com.bean;

import org.activiti.engine.impl.persistence.entity.UserEntityImpl;

/*
*   This class is used to extends the user basic info.
* */
public class UserPO extends UserEntityImpl {

    @Override
    public String toString() {
        return this.email + ", " + this.password;
    }
}
