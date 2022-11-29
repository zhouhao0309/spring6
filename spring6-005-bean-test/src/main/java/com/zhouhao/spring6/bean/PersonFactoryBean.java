package com.zhouhao.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @program: spring6
 * @description: 测试工厂类
 * @author: 周浩
 * @create: 2022-11-25 14:00
 **/
public class PersonFactoryBean implements FactoryBean<Person> {
    /**
     *  PersonFactoryBean也是一个bean，不过这个bean特殊，叫做工厂bean
     *  通过工厂bean这个特殊的bean获取一个普通的bean
     * @return
     * @throws Exception
     */
    @Override
    public Person getObject() throws Exception {
        //这个bean的创建还是我们程序员自己new的
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    //这个方法在接口中有默认实现，默认返回true，表示单例
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
