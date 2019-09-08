package com.monkey1024.factory.abstractfactory;

public class IPhoneFactory implements PhoneFactory {

    @Override
    public Phone producePhone() {
        return new IPhone();
    }

    @Override
    public Charger produceCharger() {
        return new AppleCharger();
    }
}
