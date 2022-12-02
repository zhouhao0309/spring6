package com.zhouhao.myspring.test;

import com.zhouhao.myspring.frame.core.ApplicationContext;
import com.zhouhao.myspring.frame.core.ClassPathXmlApplicationContext;
import com.zhouhao.spring.bean.UserService;
import org.dom4j.DocumentException;
import org.junit.Test;

/**
 * @program: spring6
 * @description: 测试类
 * @author: 周浩
 * @create: 2022-12-02 13:12
 **/
public class myspringtest {
    @Test
    public void testMyspring() throws DocumentException {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
        Object user = applicationContext.getBean("User");
        System.out.println(user);
        UserService userService=(UserService)applicationContext.getBean("UserService");
        userService.save();

    }
}
