package com.yczuoxin.pattern.decorator;

public class VehicleWrapper extends Vehicle {

    private Vehicle vehicle;

    public VehicleWrapper(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    @Override
    public void move() {
        vehicle.move();
        System.out.println("移动起来带着风");
    }
}
