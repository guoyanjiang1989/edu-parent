package com.gyj.dao;

import java.util.List;

public interface IBaseDao<T> {

    public List<T> findAllUsers();
    public T findUserById(int id);
    public T findUserById(String id);
    public void addUser(T user);
    public void deleteUser(int id);
    public void deleteUser(String id);
    public void updateUser(T user);
}
