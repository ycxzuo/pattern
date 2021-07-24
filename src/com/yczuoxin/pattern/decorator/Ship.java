package com.yczuoxin.pattern.decorator;

public class Ship extends Vehicle {
    @Override
    public void move() {
        System.out.println("轮船跑起来");
    }
}
