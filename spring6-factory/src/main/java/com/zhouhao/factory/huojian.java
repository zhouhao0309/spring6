package com.zhouhao.factory;

/**
 * 具体产品角色
 * @program: spring6
 * @description: 火箭类继承武器抽象类
 * @author: 周浩
 * @create: 2022-11-24 18:01
 **/
public class huojian extends Weapon{

    @Override
    public void attack() {
        System.out.println("火箭发送导弹");
    }
}
