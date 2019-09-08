package service.impl;

import service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("执行service中的addUser方法");
    }

    @Override
    public void deleteUser() {
        System.out.println("执行service中的deleteUser方法");
    }

    @Override
    public void updateUser() {
        System.out.println("执行service中的updateUser方法");
    }

    @Override
    public void selectUser() {
        System.out.println("执行service中的selectUser方法");
    }

    @Override
    public void selectUserById(int id) {
        System.out.println("执行service中的selectUserById方法");
    }
}
