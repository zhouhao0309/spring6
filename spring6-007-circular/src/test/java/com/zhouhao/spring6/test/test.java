package com.zhouhao.spring6.test;

import com.zhouhao.spring6.bean.Husband;
import com.zhouhao.spring6.bean.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring6
 * @description:
 * @author: 周浩
 * @create: 2022-11-29 20:07
 **/
public class test {
    @Test
    public void testHusbandWife(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Husband husbandBean = applicationContext.getBean("husbandBean", Husband.class);
        System.out.println(husbandBean);
        Wife wifeBean = applicationContext.getBean("wifeBean", Wife.class);
        System.out.println(wifeBean);
    }
    
}
