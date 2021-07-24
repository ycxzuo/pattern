package com.yczuoxin.pattern.decorator;

public class VehicleWrapper2 extends Vehicle {

    private Vehicle vehicle;

    public VehicleWrapper2(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void move() {
        vehicle.move();
        System.out.println("还会喷出彩虹烟雾");
    }
}
