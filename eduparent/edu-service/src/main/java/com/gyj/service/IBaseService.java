package com.gyj.service;

import java.util.List;

public interface IBaseService<T> {

    public List<T> findAllUsers();
    public T findUserById(int id);
    public T findUserById(String id);
    public void addUser(T t);
    public void deleteUser(int id);
    public void deleteUser(String id);
    public void updateUser(T t);
}
