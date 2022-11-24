package com.zhouhao.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: spring6
 * @description: bean类
 * @author: 周浩
 * @create: 2022-11-23 10:56
 **/
public class OrderDao {
    private static final Logger logger= LoggerFactory.getLogger(OrderDao.class);

    public void insert(){
        logger.info("Order的logger方法正在执行");
    }
}
