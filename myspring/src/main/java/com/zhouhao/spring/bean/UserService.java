package com.zhouhao.spring.bean;

/**
 * @program: spring6
 * @description: 表现层
 * @author: 周浩
 * @create: 2022-11-30 22:17
 **/
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void save(){
        userDao.insert();
    }
}
