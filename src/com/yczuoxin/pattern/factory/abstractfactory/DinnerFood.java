package com.yczuoxin.pattern.factory.abstractfactory;

public class DinnerFood extends FoodFactory {
    public DinnerFood() {
        super(new BeefFactory(), new PotatoFactory());
    }
}
