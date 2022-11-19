package com.zhouhao.spring6.service.imp;

import com.zhouhao.spring6.dao.UserDao;
import com.zhouhao.spring6.dao.imp.UserDaoImpl;
import com.zhouhao.spring6.service.UserService;

/**
 * @program: spring6
 * @description: 实现类
 * @author: 周浩
 * @create: 2022-11-19 21:02
 **/
public class UserServiceImpl implements UserService {

    private UserDao userDao=new UserDaoImpl();
    @Override
    public void delectUser() {
        userDao.delectById();
    }
}
