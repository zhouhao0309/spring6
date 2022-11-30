package com.zhouhao.spring6.test;

import com.zhouhao.spring6.bean.Student;
import com.zhouhao.spring6.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring6
 * @description: 测试类
 * @author: 周浩
 * @create: 2022-11-29 12:14
 **/
public class test {
    @Test
    public void usertest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("uu", User.class);
        System.out.println("第四步");

        ClassPathXmlApplicationContext context=(ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }
    @Test
    public void testStudent(){
        Student student = new Student();
        System.out.println(student);

        //将自己new的对象交给spring容器来管理，半路交给spring管理
        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        factory.registerSingleton("studentBean",student);

        //从spring容器当中获取
        Object studentBean = factory.getBean("studentBean");
        System.out.println(studentBean);
    }
}
