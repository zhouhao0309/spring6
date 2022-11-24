package com.zhouhao.factory;

/**
 * @program: spring6
 * @description: 坦克类继承武器抽象类
 * @author: 周浩
 * @create: 2022-11-24 18:01
 **/
public class tanke extends Weapon{

    @Override
    public void attack() {
        System.out.println("坦克发射大炮");
    }
}
