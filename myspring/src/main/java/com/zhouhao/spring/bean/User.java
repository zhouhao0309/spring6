package com.zhouhao.spring.bean;

/**
 * @program: spring6
 * @description: 用户类
 * @author: 周浩
 * @create: 2022-11-30 22:12
 **/
public class User {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
