package com.monkey1024.factory.test;

import com.monkey1024.factory.abstractfactory.Charger;
import com.monkey1024.factory.abstractfactory.IPhoneFactory;
import com.monkey1024.factory.abstractfactory.Phone;

public class Test03 {

    public static void main(String[] args) {

        IPhoneFactory iPhoneFactory = new IPhoneFactory();
        Phone phone = iPhoneFactory.producePhone();
        Charger charger = iPhoneFactory.produceCharger();
        charger.charge();
        phone.play();
    }
}
