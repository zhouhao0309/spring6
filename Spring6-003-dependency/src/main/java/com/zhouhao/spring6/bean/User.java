package com.zhouhao.spring6.bean;

/**
 * @program: spring6
 * @description: bean测试类
 * @author: 周浩
 * @create: 2022-11-23 11:19
 **/
public class User {
    private String password;
    private String username;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
