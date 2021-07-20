package com.yczuoxin.pattern.factory.abstractfactory;

import com.yczuoxin.pattern.factory.abstractfactory.bean.Meat;
import com.yczuoxin.pattern.factory.abstractfactory.bean.Pork;

public class PortFactory extends MeatFactory{
    @Override
    public Meat create() {
        return new Pork();
    }
}
