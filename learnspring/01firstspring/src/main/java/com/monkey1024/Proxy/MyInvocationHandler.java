package com.monkey1024.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        MyLog.doLog(target.getClass());

        Object invoke = method.invoke(target, args);

        MyTransacation.doTransaction(target.getClass());


        return invoke;
    }
}