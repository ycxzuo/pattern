package com.yczuoxin.pattern.factory.abstractfactory.bean;

public class Food {

    private final Meat meat;

    private final Vegetable vegetable;

    public Food(Meat meat, Vegetable vegetable) {
        this.meat = meat;
        this.vegetable = vegetable;
    }

    public void eat() {
        meat.color();
        vegetable.taste();
    }

}
