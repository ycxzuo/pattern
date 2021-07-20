package com.yczuoxin.pattern.factory.abstractfactory;

import com.yczuoxin.pattern.factory.abstractfactory.bean.Beef;
import com.yczuoxin.pattern.factory.abstractfactory.bean.Meat;

public class BeefFactory extends MeatFactory {
    @Override
    public Meat create() {
        return new Beef();
    }
}
