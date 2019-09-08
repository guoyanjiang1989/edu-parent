package com.monkey1024.factory.factorymethod;

public class IPhone8Factory implements IPhoneFactory {

    @Override
    public IPhone produce() {
        return new IPhone8();
    }
}
