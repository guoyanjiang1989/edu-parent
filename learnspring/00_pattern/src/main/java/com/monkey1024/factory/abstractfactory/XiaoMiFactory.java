package com.monkey1024.factory.abstractfactory;

public class XiaoMiFactory implements PhoneFactory {

    @Override
    public Phone producePhone() {
        return new XiaoMi();
    }

    @Override
    public Charger produceCharger() {
        return new XiaoMiCharger();
    }
}
