package com.yczuoxin.pattern.factory.abstractfactory;

import com.yczuoxin.pattern.factory.abstractfactory.bean.Food;

public abstract class FoodFactory {

    private MeatFactory meatFactory;

    private VegetableFactory vegetableFactory;

    protected FoodFactory (MeatFactory meatFactory, VegetableFactory vegetableFactory) {
        this.meatFactory = meatFactory;
        this.vegetableFactory = vegetableFactory;
    }

    public void create(){
        meatFactory.create().color();
        vegetableFactory.create().taste();
    }

}
