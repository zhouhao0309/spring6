package com.zhouhao.spring6.service;

import com.zhouhao.spring6.dao.OrderDao;

/**
 * @program: spring6
 * @description: bean类
 * @author: 周浩
 * @create: 2022-11-23 10:58
 **/
public class OrderService {
    private OrderDao orderDao;


    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void generate(){
        orderDao.insert();
    }
}
