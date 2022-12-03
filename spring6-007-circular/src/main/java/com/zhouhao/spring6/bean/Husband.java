package com.zhouhao.spring6.bean;

/**
 * @program: spring6
 * @description: 丈夫测试类
 * @author: 周浩
 * @create: 2022-11-29 15:55
 **/
public class Husband {
    private String name;
    private Wife wife;

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", wife=" + wife.getName() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
