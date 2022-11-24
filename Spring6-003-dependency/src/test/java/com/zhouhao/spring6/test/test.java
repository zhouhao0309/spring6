package com.zhouhao.spring6.test;

import com.zhouhao.spring6.bean.*;
import com.zhouhao.spring6.jdbc.Mysource;
import com.zhouhao.spring6.service.CustomService;
import com.zhouhao.spring6.service.OrderService;
import com.zhouhao.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

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

    @Test
    public void springTets2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CustomService customService = applicationContext.getBean("csbean3", CustomService.class);
        customService.save();
    }

    @Test
    public void springTest3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        OrderService orderService = applicationContext.getBean("OrderService", OrderService.class);
        orderService.generate();

        OrderService orderService2 = applicationContext.getBean("OrderService2", OrderService.class);
        orderService2.generate();
    }

    @Test
    public void springTest4(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("set-di.xml");
        User userbean = applicationContext.getBean("userbean", User.class);
        System.out.println(userbean);
        System.out.println(new Date());

    }

    @Test
    public void springTest5(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("set-di.xml");
        Mysource mysourcebean = applicationContext.getBean("Mysourcebean", Mysource.class);
        System.out.println(mysourcebean);
    }

    @Test
    public void springTest6(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-array.xml");
        ZhouHao zhouhaobean = applicationContext.getBean("zhouhaobean", ZhouHao.class);
        System.out.println(zhouhaobean);
    }

    @Test
    public void springTest7(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-collection.xml");
        Person personbean = applicationContext.getBean("personbean", Person.class);
        System.out.println(personbean);
    }

    @Test
    public void springTets8(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("set-di.xml");
        Cat catbean = applicationContext.getBean("catbean", Cat.class);
        System.out.println(catbean);
    }

    @Test
    public void springTets9(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("set-di.xml");
        MathBean mathbean = applicationContext.getBean("mathbean", MathBean.class);
        System.out.println(mathbean);
    }

    @Test
    public void springTest10(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-p.xml");
        Dog dogbean = applicationContext.getBean("dogbean", Dog.class);
        System.out.println(dogbean);
    }

    @Test
    public void autospringTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-autowire.xml");
        OrderService orderServicebean = applicationContext.getBean("orderServicebean", OrderService.class);
        orderServicebean.generate();
    }

    @Test
    public void autospringTest2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-autowire.xml");
        OrderService orderServicebean1 = applicationContext.getBean("orderServicebean1", OrderService.class);
        orderServicebean1.generate();
    }

    @Test
    public void autoSpringByTypeTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-autowire.xml");
        CustomService customServicebean = applicationContext.getBean("customServicebean", CustomService.class);
        customServicebean.save();
    }

}
