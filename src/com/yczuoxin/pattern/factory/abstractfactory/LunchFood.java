package com.yczuoxin.pattern.factory.abstractfactory;

import com.yczuoxin.pattern.factory.abstractfactory.bean.Food;

public class LunchFood extends FoodFactory{

    public LunchFood() {
        super(new PortFactory(), new TomatoFactory());
    }
}
