package com.hxzy.spring.demo03;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean {
    private String [] arr;
    private List<Car> list;
    private Set<String> set;
    private Map<String,Object> map;

    public String[] getArr() {
        return arr;
    }

    public List<Car> getList() {
        return list;
    }

    public Set<String> getSet() {
        return set;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setList(List<Car> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
