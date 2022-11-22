package com.zhouhao.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: spring6
 * @description: bean类
 * @author: 周浩
 * @create: 2022-11-21 20:05
 **/
public class UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    public void insert() {
        logger.info("保存daoxx");
    }
}
