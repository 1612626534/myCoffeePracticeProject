package com.practice.service.user;

import org.activiti.engine.IdentityService;
import org.activiti.engine.impl.persistence.entity.UserEntity;
import org.springframework.util.StringUtils;

public class UserServiceImpl implements UserService {

    private IdentityService identityService;

    public UserEntity getUser(String email, String password) throws NullPointerException{
        UserEntity userEntity = (UserEntity) identityService.createUserQuery().userEmail(email).singleResult();
        boolean isPasswordParameterEmpty = StringUtils.isEmpty(password);
        boolean isPasswordEmpty = StringUtils.isEmpty(userEntity.getPassword());
        boolean isPasswordRight = !isPasswordParameterEmpty && !isPasswordEmpty && password.equals(userEntity.getPassword());
        if (!isPasswordRight) {
            throw new NullPointerException("user " + email +" is not exist");
        }
        return userEntity;
    }

    public IdentityService getIdentityService() {
        return identityService;
    }

    public void setIdentityService(IdentityService identityService) {
        this.identityService = identityService;
    }
}
