package com.yczuoxin.pattern.factory.abstractfactory;

import com.yczuoxin.pattern.factory.abstractfactory.bean.Potato;
import com.yczuoxin.pattern.factory.abstractfactory.bean.Vegetable;

public class PotatoFactory extends VegetableFactory{
    @Override
    public Vegetable create() {
        return new Potato();
    }
}
