package com.service.user;


import com.bean.UserPO;
import org.activiti.engine.impl.persistence.entity.UserEntity;

public interface UserService {

    public UserPO getUser(String email, String password) throws NullPointerException;
}
