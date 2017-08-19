package com.service.user;

import com.action.user.UserAction;
import com.bean.UserPO;
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
        this.userAction = (UserAction) applicationContext.getBean("userAction");
    }

//    @Test
    public void loginMethodTest() {
        UserPO userPO = new UserPO();
        userPO.setEmail("caesar@dev.local.xx");
        userPO.setPassword("Newpark0521");

        this.userAction.setUserEntity(userPO);
        this.userAction.login();
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
