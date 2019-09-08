package com.monkey1024.factory.staticfactory;

public class IPhoneFactory {

    public static IPhone produce(String model){

        if ("IPoneX".equalsIgnoreCase(model)){
            return new IPhoneX();
        }else if ("iphone8plus".equalsIgnoreCase(model)){
            return new IPhone8Plus();
        }else {
            return null;
        }
    }
}
