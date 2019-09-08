package com.monkey1024.proxy.staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        XiaoMan xiaoMan = new XiaoMan();
        //NaNa nana = new NaNa(xiaoMan);

        Beauty proxy = (Beauty)Proxy.newProxyInstance(xiaoMan.getClass().getClassLoader(), xiaoMan.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                Object invoke;
                if ("gift".equals(method.getName())){
                    invoke = method.invoke(xiaoMan, new Object[]{(Integer) args[0] / 2});
                }else {
                    invoke = method.invoke(xiaoMan);
                }

                return invoke;
            }
        });

        You you = new You(proxy);

        you.makeFriend();
        you.show();
    }
}
