package com.practice.service.user;


import org.activiti.engine.impl.persistence.entity.UserEntity;

public interface UserService {

    public UserEntity getUser(String email, String password) throws NullPointerException;
}
