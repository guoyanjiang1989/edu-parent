package com.monkey1024.test;

import com.monkey1024.factory.staticfactory.IPhone;
import com.monkey1024.factory.staticfactory.IPhoneFactory;

public class Test01 {

    public static void main(String[] args) {

        IPhone iphoneX = IPhoneFactory.produce("iphoneX");

        iphoneX.play();
    }
}
