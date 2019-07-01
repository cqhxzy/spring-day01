package com.hxzy.spring.demo03;

/**
 * 通过set方法为属性对象注入值
 */
public class Employee {
    private String name;
    private Car car;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
