package com.hxzy.spring.demo01;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    @Test
    @Ignore
    public void demo1() {
        /*传统方式*/
        UserService service = new UserServiceImpl();
        service.service();

    }

    @Test
    public void demo2(){
        /*通过spring的方式调用*/
        //创建Spring的工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.service();
    }
}