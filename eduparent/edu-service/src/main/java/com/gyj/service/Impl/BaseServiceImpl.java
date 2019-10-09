package com.gyj.service.Impl;

import com.gyj.dao.IUserDao;
import com.gyj.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    @Autowired
    protected IUserDao userDao;
}
