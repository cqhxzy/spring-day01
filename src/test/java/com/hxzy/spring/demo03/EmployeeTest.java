package com.hxzy.spring.demo03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

    /**
     * 测试，为对象类型的属性通过setter注入属性
     */
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object employee = context.getBean("employee");
        System.out.println(employee);

    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object car2 = context.getBean("car2");
        System.out.println(car2);
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object emp2 = context.getBean("emp2");
        System.out.println(emp2);
    }
}
