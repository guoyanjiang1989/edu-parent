package com.gyj.edu.service.base;

import com.gyj.edu.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class BaseServiceImpl<T> implements IBaseService<T>{

    @Autowired
    protected UserMapper userMapper;

    @Override
    public List<T> findUsers() {
        return null;
    }

    @Override
    public T findUserById(Integer id) {
        return null;
    }

    @Override
    public void save(T t) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void update(T t) {

    }
}
