package com.hxzy.spring.demo02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class CustomerDaoImplTest {


    @Test
    public void demo1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDaoImpl customerService = (CustomerDaoImpl) context.getBean("customerService");
        customerService.service();
        //当spring工厂关闭时，且创建的对象是单例时，触发对象的销毁方法。
        ((ClassPathXmlApplicationContext) context).close();
    }

    /**
     * 测试bean的作用范围
     */
    @Test
    public void demo2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDaoImpl customerService1 = (CustomerDaoImpl) context.getBean("customerService");
        System.out.println("customerService1:" + customerService1);

        CustomerDaoImpl customerService2 = (CustomerDaoImpl) context.getBean("customerService");
        System.out.println("customerService2:" + customerService2);

        System.out.println(customerService1 == customerService2);

        //destroy-method方法没有被执行，因为多例模式下，spring不清楚销毁哪个对象的destroy方法
        ((ClassPathXmlApplicationContext) context).close();
    }
}