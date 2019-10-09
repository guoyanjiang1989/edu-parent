package com.gyj.edu.service.base;

import java.util.List;

public interface IBaseService<T> {

    public List<T> findUsers();
    public T findUserById(Integer id);
    public void save(T t);
    public void deleteById(Integer id);
    public void update(T t);
}
