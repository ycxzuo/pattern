package com.yczuoxin.pattern.factory.abstractfactory.test;

import com.yczuoxin.pattern.factory.abstractfactory.DinnerFood;
import com.yczuoxin.pattern.factory.abstractfactory.FoodFactory;
import com.yczuoxin.pattern.factory.abstractfactory.LunchFood;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        FoodFactory foodFactory = new DinnerFood();
        foodFactory.create();
        FoodFactory foodFactory2 = new LunchFood();
        foodFactory2.create();
    }

}
