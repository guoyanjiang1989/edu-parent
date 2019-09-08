package com.monkey1024.factory.factorymethod;

public class IPhoneXFactory implements IPhoneFactory {

    @Override
    public IPhone produce() {
        return new IPhoneX();
    }
}
