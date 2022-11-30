package com.zhouhao.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @program: spring6
 * @description: bean后处理器
 * @author: 周浩
 * @create: 2022-11-29 13:48
 **/
public class beanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行bean后处理器的before方法");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    /**
     *
     * @param bean the new bean instance     //刚创建的bean对象
     * @param beanName the name of the bean   //bean的名字
     * @return
     * @throws BeansException
     */

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行bean后处理器的before方法");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
