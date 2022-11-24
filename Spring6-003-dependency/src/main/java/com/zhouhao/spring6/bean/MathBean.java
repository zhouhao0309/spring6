package com.zhouhao.spring6.bean;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

/**
 * @program: spring6
 * @description: 特殊符号的注入bean测试类
 * @author: 周浩
 * @create: 2022-11-23 19:35
 **/
public class MathBean {
    private String result;

    @Override
    public String toString() {
        return "MathBean{" +
                "result='" + result + '\'' +
                '}';
    }

    public void setResult(String result) {
        this.result = result;
    }
}
