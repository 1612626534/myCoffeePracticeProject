package com.utils;

import com.bean.user.UserPO;
import org.springframework.util.StringUtils;

public class UserUtils {

    public static boolean isPasswordRight(String password, UserPO user) {
        boolean isPasswordParameterEmpty = StringUtils.isEmpty(password);
        boolean isPasswordEmpty = StringUtils.isEmpty(user.getPassword());
        return !isPasswordParameterEmpty && !isPasswordEmpty && password.trim().equals(user.getPassword().trim());
    }
}
