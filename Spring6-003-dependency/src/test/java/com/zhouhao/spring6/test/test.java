package com.zhouhao.spring6.test;

import com.zhouhao.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring6
 * @description: 测试剋
 * @author: 周浩
 * @create: 2022-11-21 19:57
 **/
public class test {
    @Test
    public void springTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        UserService userService = applicationContext.getBean("UserService", UserService.class);
        userService.saveUser();
    }
}
