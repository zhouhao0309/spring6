package com.zhouhao.spring6.bean;

/**
 * @program: spring6
 * @description: cat的bean类型
 * @author: 周浩
 * @create: 2022-11-23 19:26
 **/
public class Cat {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Cat{" +
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
