package com.yczuoxin.pattern.factory.abstractfactory;

import com.yczuoxin.pattern.factory.abstractfactory.bean.Tomato;
import com.yczuoxin.pattern.factory.abstractfactory.bean.Vegetable;

public class TomatoFactory extends VegetableFactory {
    @Override
    public Vegetable create() {
        return new Tomato();
    }
}
