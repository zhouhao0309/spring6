package com.zhouhao.myspring.frame.core;

/**
 * @program: spring6
 * @description: ApplicationContext接口类
 * @author: 周浩
 * @create: 2022-11-30 22:54
 **/
public interface ApplicationContext {
    /**
     * 根据bean的名称获取对应的bean对象
     * @param beanName myspring配置文件当中bean标签的id
     * @return
     */
    Object getBean(String beanName);
}
