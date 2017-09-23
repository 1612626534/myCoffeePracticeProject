package com.service.user;

import com.action.user.UserAction;
import com.bean.user.UserPO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

    private UserService userService;
    private UserAction userAction;

    @Before
    public void getSqlSessionFactory() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.userService = (UserService) applicationContext.getBean("userService");
    }

    @Test
    public void getUserTest() {
        UserPO user = null;
        try {
            user = this.userService.getUser("caesar@dev.local.xx", "Newpark0521");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(user);
        Assert.assertNotNull(user);
    }

}
