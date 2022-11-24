package com.zhouhao.factory;

/**
 * @program: spring6
 * @description: 工厂类角色
 * @author: 周浩
 * @create: 2022-11-24 18:05
 **/
public class WeaponFactory {
    public static Weapon get(String type){
        if ("tanke".equals(type)){
            return new tanke();
        } else if ("huojian".equals(type)) {
            return new huojian();
        }else {
            throw new RuntimeException("不支持该类武器");
        }
    }
}
