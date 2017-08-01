package com.practice.dao.user;

import com.practice.bean.UserPO;
import org.apache.ibatis.annotations.Param;

public interface IUserDAO {

    UserPO getUserByEmail(@Param("email") String email);
}
