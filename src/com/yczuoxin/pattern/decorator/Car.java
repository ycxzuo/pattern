package com.yczuoxin.pattern.decorator;

public class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("小汽车跑起来");
    }
}
