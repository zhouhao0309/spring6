package com.zhouhao.spring6.bean;

/**
 * @program: spring6
 * @description: 测试类bean
 * @author: 周浩
 * @create: 2022-11-29 12:04
 **/

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * bean的生命周期五步
 * 1.实例化bean（调用无参数构造方法）
 * 2.给bean的属性赋值（调用set方法）
 * 3.初始化bean（会调用bean的init方法，这个方法需要程序员自己编写）
 * 4.使用bean
 * 5.销毁bean（调用distory方法，这个方法需要自己编写）
 */
public class User implements BeanNameAware , BeanClassLoaderAware , BeanFactoryAware , InitializingBean , DisposableBean{
    private String name;

    public User() {
        System.out.println("第一步，无参数构造方法执行");
    }

    public void setName(String name) {
        System.out.println("第二步：给对象属性赋值");
        this.name = name;
    }
    public void initBean(){
        System.out.println("第三步：初始化bean");
    }
    public void destoryBean(){
        System.out.println("第五步：销毁bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("这个bean的加载器是"+classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("生产这个bean的工厂对象是"+beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("这个bean的名称是"+name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean的方法执行");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean的方法执行 ");
    }
}
