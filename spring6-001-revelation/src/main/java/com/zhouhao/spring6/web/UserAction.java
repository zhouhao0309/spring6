package com.zhouhao.spring6.web;

import com.zhouhao.spring6.service.UserService;
import com.zhouhao.spring6.service.imp.UserServiceImpl;

/**
 * @program: spring6
 * @description: 表示层
 * @author: 周浩
 * @create: 2022-11-19 20:35
 **/
public class UserAction {
    private UserService userService=new UserServiceImpl();

    public void deleteRequest(){
        userService.delectUser();
    }
}
