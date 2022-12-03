package com.zhouhao.spring6.bean2;

/**
 * @program: spring6
 * @description:
 * @author: 周浩
 * @create: 2022-11-29 20:28
 **/
public class Husband {
    private String name;
    private Wife wife;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", wife=" + wife.getName() +
                '}';
    }

    public Husband(String name, Wife wife) {
        this.name = name;
        this.wife = wife;
    }
}
