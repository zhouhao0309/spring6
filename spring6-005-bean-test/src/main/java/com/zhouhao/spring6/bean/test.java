package com.zhouhao.spring6.bean;

/**
 * @program: spring6
 * @description: 测试类
 * @author: 周浩
 * @create: 2022-11-25 13:21
 **/
public class test {
    public test() {
        int a=5;
        int x=0;
        int b=5;
         x=a+b;
        System.out.println("a+b="+x);
    }

    public static void main(String[] args) {
        test test = new test();
        System.out.println(test);
    }
}
