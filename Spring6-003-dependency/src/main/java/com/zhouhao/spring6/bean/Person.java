package com.zhouhao.spring6.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @program: spring6
 * @description:
 * @author: 周浩
 * @create: 2022-11-23 19:05
 **/
public class Person {
    //注入List集合
    private List<String> names;
    //注入set集合
    private Set<String> addrs;

    //注入Map集合
    private Map<Integer,String> map;

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", addrs=" + addrs +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    //注入属性对象
    //properties的父类是Hashtable，Hashtable实现了Map接口
    //注入方式和Map不一样
    //properties的key和value属性只能是String类型
    private Properties properties;

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setAddrs(Set<String> addrs) {
        this.addrs = addrs;
    }
}
