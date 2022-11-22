package com.zhouhao.spring6.service;

import com.zhouhao.spring6.dao.UserDao;
import com.zhouhao.spring6.dao.VipDao;

/**
 * @program: spring6
 * @description: bean类
 * @author: 周浩
 * @create: 2022-11-22 13:58
 **/
public class UserService {

    private UserDao userDao;

    private VipDao vipDao;
    //spring容器的set注入
    //方法可以自己命名，但是首字母要是set
    public void setMyUserDao(UserDao dao){
        this.userDao=dao;
    }



    public void saveUser(){
        userDao.insert();
    }
}
