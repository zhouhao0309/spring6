package com.zhouhao.reflect;

import com.zhouhao.annotation.Component;

/**
 * @program: spring6
 * @description: 反射注解
 * @author: 周浩
 * @create: 2022-12-02 21:12
 **/
public class reflectTest {
    public static void main(String[] args) throws ClassNotFoundException {
        //根据反射获取注解
        //1.获取类
        Class<?> aClass = Class.forName("com.zhouhao.bean.AonnotationTest");
        if (aClass.isAnnotationPresent(Component.class)){
            //获取注解
            Component annotation = aClass.getAnnotation(Component.class);
            System.out.println(annotation.value());
        }
    }
}
