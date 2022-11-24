package com.zhouhao.spring6.bean;

/**
 * @program: spring6
 * @description: bean类
 * @author: 周浩
 * @create: 2022-11-23 18:04
 **/
public class Women {
    private String name;

    @Override
    public String toString() {
        return "Women{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
