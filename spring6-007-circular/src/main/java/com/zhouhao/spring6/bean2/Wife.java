package com.zhouhao.spring6.bean2;

/**
 * @program: spring6
 * @description:
 * @author: 周浩
 * @create: 2022-11-29 20:28
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

    public Wife(String name, Husband husband) {
        this.name = name;
        this.husband = husband;
    }
}
