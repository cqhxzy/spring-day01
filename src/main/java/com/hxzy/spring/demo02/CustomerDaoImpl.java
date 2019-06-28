package com.hxzy.spring.demo02;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void service() {
        System.out.println("CustomerDaoImpl service方法被执行了");
    }

    public void setUp(){
        System.out.println("CustomerDaoImpl setUp方法被执行了");
    }

    public void destroy() {
        System.out.println("CustomerDaoImpl destroy方法被执行了");
    }
}
