package com.zhouhao.spring6.bean;

/**
 * @program: spring6
 * @description: 测试工厂类
 * @author: 周浩
 * @create: 2022-11-25 12:50
 **/
public class StarFactory {

    //简单工厂模式又叫做静态工厂方法模式
    public static Star get(){
        return new Star();
    }
}
