package com.zhouhao.factory;

/**
 * @program: spring6
 * @description: main方法测试类
 * @author: 周浩
 * @create: 2022-11-24 19:58
 **/
public class test {
    public static void main(String[] args) {
        Weapon tanke = WeaponFactory.get("tanke");
        tanke.attack();
    }
}
