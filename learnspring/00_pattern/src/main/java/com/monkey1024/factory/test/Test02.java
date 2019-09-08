package com.monkey1024.factory.test;

import com.monkey1024.factory.factorymethod.IPhone;
import com.monkey1024.factory.factorymethod.IPhone8Factory;

public class Test02 {

    public static void main(String[] args) {

        IPhone8Factory iPhone8Factory = new IPhone8Factory();
        IPhone iphone8 = iPhone8Factory.produce();
        iphone8.play();
    }
}
