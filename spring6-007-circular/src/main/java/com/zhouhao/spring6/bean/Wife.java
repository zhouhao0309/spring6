package com.zhouhao.spring6.bean;

/**
 * @program: spring6
 * @description: 妻子测试类
 * @author: 周浩
 * @create: 2022-11-29 19:41
 **/
public class Wife {
    private String name;
    private Husband husband;

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", husband=" + husband.getName() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }
}
