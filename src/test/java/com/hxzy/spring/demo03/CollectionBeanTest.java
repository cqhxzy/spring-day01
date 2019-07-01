package com.hxzy.spring.demo03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class CollectionBeanTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    CollectionBean collectionBean = (CollectionBean) context.getBean("collectionBean");

    @Test
    public void test1(){
        System.out.println(Arrays.toString(collectionBean.getArr()));
    }

    @Test
    public void tes2() {
        List<Car> list = collectionBean.getList();
        list.stream().forEach(System.out::println);
    }
    @Test
    public void test3() {
        Set<String> set = collectionBean.getSet();
        set.stream().forEach(System.out::println);
    }
    @Test
    public void test4() {
        Map<String, Object> map = collectionBean.getMap();
        map.keySet().stream().forEach(t ->
            System.out.println("key:" + t + ",value:" + map.get(t).toString())
        );
    }

}