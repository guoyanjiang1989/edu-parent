package com.monkey1024.proxy.staticproxy;

public class XiaoMan implements Beauty {

    @Override
    public void eat() {
        System.out.println("小曼吃饭");
    }

    @Override
    public void gift(int count) {
        System.out.println("收到"+count+"个礼物");
    }
}
