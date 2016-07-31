package com.bluestone.usercenter.impl;

import com.bluestone.usercenter.dao.intf.UserDaoService;
import com.bluestone.usercenter.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by yumo on 16/7/29.
 */
public class SayHelloImpl implements SayHelloService {
    private UserDaoService userDao;


    @Override
    public String sayHello() {
        return "hello world...i am "+userDao.getUserName();
    }

    public UserDaoService getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDaoService userDao) {
        this.userDao = userDao;
    }
}
