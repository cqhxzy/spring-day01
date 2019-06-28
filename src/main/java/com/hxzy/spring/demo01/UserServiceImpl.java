package com.hxzy.spring.demo01;

/**
 * 用户管理业务接口的实现类
 */
public class UserServiceImpl implements UserService {

    @Override
    public void service() {
        System.out.println("传统实现方式的service方法被执行了");
    }
}
