package com.dao.user;

import com.bean.user.UserPO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

public class UserDAOTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void getSqlSessionFactory() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
    }

    @Test
    public void getUserByEmailTest() {
        SqlSession session = this.sqlSessionFactory.openSession();
        UserPO user = session.getMapper(IUserDAO.class).getUserByEmail("caesar@dev.local.xx");
        System.out.println(user.getPassword());
        Assert.assertNotNull(user);
    }

    @Test
    public void getUUIDValues() {
        for (int i = 0; i< 100; i ++) {
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid);
        }

    }

}