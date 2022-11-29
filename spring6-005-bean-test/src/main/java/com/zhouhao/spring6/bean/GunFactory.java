package com.zhouhao.spring6.bean;

/**
 * @program: spring6
 * @description: 工厂方法模式当中的具体工厂角色
 * @author: 周浩
 * @create: 2022-11-25 13:16
 **/
public class GunFactory {
    public Gun get(){
        return new Gun();
    }
}
