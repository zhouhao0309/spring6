package com.zhouhao.spring6.test;

import com.zhouhao.spring6.bean.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring6
 * @description: 测试类
 * @author: 周浩
 * @create: 2022-11-24 20:53
 **/
public class test {
    @Test
    public void testSpring1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springbean.xml");
        SpringBean springBeantest = applicationContext.getBean("springBeantest", SpringBean.class);
        System.out.println(springBeantest);
    }
    @Test
    public void teststarspring(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springbean.xml");
        Star starbean = applicationContext.getBean("starbean", Star.class);
        System.out.println(starbean);
    }
    @Test
    public void test(){
        Star star = StarFactory.get();
        System.out.println(star);
    }
    @Test
    public void gunFactory(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springbean.xml");
        Gun gunbean = applicationContext.getBean("gunbean", Gun.class);
        System.out.println(gunbean);
    }

    @Test
    public void persontest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springbean.xml");
        Person personbean = applicationContext.getBean("personbean", Person.class);
        System.out.println(personbean);
    }
    @Test
    public void studentbeantest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springbean.xml");
        Student studentbean = applicationContext.getBean("studentbean", Student.class);
        System.out.println(studentbean);
    }
}
