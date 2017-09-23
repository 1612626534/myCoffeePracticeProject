package com.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBasicDAO {

    private SqlSessionFactory sqlSessionFactory;

    public TestBasicDAO() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
    }

    public SqlSessionFactory getSqlSessionFactory() {
        return this.sqlSessionFactory;
    }
}
