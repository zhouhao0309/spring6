package com.zhouhao.spring6.test;

import com.zhouhao.spring6.bean.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring6
 * @description: 测试类
 * @author: 周浩
 * @create: 2022-11-24 15:32
 **/
public class SpringBeanScopeTest {
    @Test
    public void testSpringScope(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean zhouhao = applicationContext.getBean("zhouhao", SpringBean.class);
        System.out.println(zhouhao);

        SpringBean zhouhao1 = applicationContext.getBean("zhouhao", SpringBean.class);
        System.out.println(zhouhao1);
    }
}
