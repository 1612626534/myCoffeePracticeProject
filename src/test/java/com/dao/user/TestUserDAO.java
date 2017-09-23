package com.dao.user;

import com.bean.user.UserPO;
import com.dao.TestBasicDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

public class TestUserDAO extends TestBasicDAO {
    @Test
    public void getUserByEmailTest() {
        SqlSession session = this.getSqlSessionFactory().openSession();
        UserPO user = session.getMapper(IUserDAO.class).getUserByEmail("caesar@dev.local.xx");
        Assert.assertNotNull(user);
    }
}