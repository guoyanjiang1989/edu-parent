package com.gyj.edu.service;

import com.gyj.edu.bean.User;
import com.gyj.edu.service.base.IBaseService;

import java.util.List;

public interface IUserService extends IBaseService<User> {

    public List<User> findUsers();
    public User findUserById(Integer id);
    public void save(User t);
    public void deleteById(Integer id);
    public void update(User t);
}
