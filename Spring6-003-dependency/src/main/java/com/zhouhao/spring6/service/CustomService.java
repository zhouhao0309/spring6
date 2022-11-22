package com.zhouhao.spring6.service;

import com.zhouhao.spring6.dao.UserDao;
import com.zhouhao.spring6.dao.VipDao;

/**
 * @program: spring6
 * @description: bean类
 * @author: 周浩
 * @create: 2022-11-22 14:54
 **/
public class CustomService {
    private UserDao userDao;
    private VipDao vipDao;

    public CustomService(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }
    public void save(){
        userDao.insert();
        vipDao.insetr();
    }
}
