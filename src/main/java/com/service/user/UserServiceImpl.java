package com.service.user;

import com.bean.UserPO;
import com.dao.user.IUserDAO;
import com.utils.UserUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public UserPO getUser(String email, String password) throws NullPointerException{
        logger.info("getUser");
        SqlSession session = this.sqlSessionFactory.openSession();
        UserPO user = session.getMapper(IUserDAO.class).getUserByEmail(email);
        logger.info(user == null ? "user is empty" : user.toString());
        if (!UserUtils.isPasswordRight(password, user)) {
            logger.info("Coffee cannot find the user with the email: " + email);
            throw new NullPointerException("user " + email +" is not exist");
        }
        return user;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
}
