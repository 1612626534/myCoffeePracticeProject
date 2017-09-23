package com.service.user;


import com.bean.user.UserPO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{

    UserPO getUser(String email, String password) throws NullPointerException;
}
