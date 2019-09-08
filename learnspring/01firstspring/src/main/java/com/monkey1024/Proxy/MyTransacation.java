package com.monkey1024.Proxy;

public class MyTransacation {

    public static void doTransaction(Class<?> clazz){

        System.out.println("提交事务：" + clazz);
    }
}
