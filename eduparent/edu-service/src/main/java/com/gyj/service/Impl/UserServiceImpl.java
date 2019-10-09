package com.gyj.service.Impl;

import com.gyj.dao.IUserDao;
import com.gyj.domain.User;
import com.gyj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    public List<User> findAllUsers() {

        List<User> allUsers = userDao.findAllUsers();
        return allUsers;
    }

    public User findUserById(int id) {

        User user = userDao.findUserById(id);
        return user;
    }

    public User findUserById(String id) {

        User user = userDao.findUserById(id);
        return user;
    }

    public void addUser(User user) {

        userDao.addUser(user);
    }

    public void deleteUser(int id) {

        userDao.deleteUser(id);
    }

    public void deleteUser(String id) {

        userDao.deleteUser(id);
    }

    public void updateUser(User user) {

        userDao.updateUser(user);
    }
}
