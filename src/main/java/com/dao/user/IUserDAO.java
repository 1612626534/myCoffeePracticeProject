package com.dao.user;

import com.bean.UserPO;
import org.apache.ibatis.annotations.Param;

public interface IUserDAO {

    UserPO getUserByEmail(@Param("email") String email);
}
