package com.zhouhao.spring6.dao.imp;

import com.zhouhao.spring6.dao.UserDao;

/**
 * @program: spring6
 * @description: 实现类
 * @author: 周浩
 * @create: 2022-11-19 21:01
 **/
public class UserDaoImpl implements UserDao {
    @Override
    public void delectById() {
        System.out.println("我爱你");
    }
}
