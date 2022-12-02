package com.zhouhao.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: spring6
 * @description: 自定义注解
 * @author: 周浩
 * @create: 2022-12-02 20:49
 **/

/**
 * @Target(value = {ElementType.TYPE , ElementType.FIELD}) 表示该注解可以出现在类和属性上面
 * 使用注解的时候，属性名是value的时候，value可以省略
 */
@Target(value = {ElementType.TYPE , ElementType.FIELD})  //元注解，用来标注注解的注解，@Target()注解用来修饰@Component注解出现的位置
@Retention(RetentionPolicy.RUNTIME)  //表示@Component注解最终保留在Class文件当中，可以被反射机制读取
public @interface Component {
    //定义属性类型
    String value();

    int name=18;

    int age();
}
