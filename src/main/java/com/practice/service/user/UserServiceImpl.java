package com.practice.service.user;

import com.practice.bean.UserPO;
import com.practice.dao.user.IUserDAO;
import com.practice.utils.UserUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

public class UserServiceImpl implements UserService {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public UserPO getUser(String email, String password) throws NullPointerException{
        SqlSession session = this.sqlSessionFactory.openSession();
        UserPO user = session.getMapper(IUserDAO.class).getUserByEmail(email);
        if (!UserUtils.isPasswordRight(password, user)) {
            throw new NullPointerException("user " + email +" is not exist");
        }
        return user;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
}
