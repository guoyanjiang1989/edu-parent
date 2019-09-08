package com.monkey1024.proxy.staticproxy;

public class NaNa implements Beauty {

    private Beauty beauty;

    public NaNa(Beauty beauty) {
        this.beauty = beauty;
    }

    @Override
    public void eat() {
        beauty.eat();
    }

    @Override
    public void gift(int count) {

    }
}
