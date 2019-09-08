package com.monkey1024.test;

import com.monkey1024.Proxy.MyInvocationHandler;
import com.monkey1024.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

public class Test02 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Object userDao = context.getBean("userDao");

        UserDao userDaoProxy = (UserDao)Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), new MyInvocationHandler(userDao));

        userDaoProxy.addUser();
    }
}
