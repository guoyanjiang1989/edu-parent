package com.monkey1024.service.impl;

import com.monkey1024.dao.UserDao;
import com.monkey1024.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser() {
        userDao.addUser();
    }

}
