package com.zhouhao.spring6.bean;

import java.util.Date;

/**
 * @program: spring6
 * @description: 学生类bean
 * @author: 周浩
 * @create: 2022-11-28 17:43
 **/
public class Student {
    private Date date;


    @Override
    public String toString() {
        return "Student{" +
                "date=" + date +
                '}';
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static void main(String[] args) {
        System.out.println(new Date());
    }
}
