package com.zhouhao.spring6.bean;

import java.util.Date;

/**
 * @program: spring6
 * @description: p命名空间测试bean类
 * @author: 周浩
 * @create: 2022-11-23 20:02
 **/
public class Dog {
    //简单类型
    private String name;
    private int age;
    //非简单类型
    private Date date;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
