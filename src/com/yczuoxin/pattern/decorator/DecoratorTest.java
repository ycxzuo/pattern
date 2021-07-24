package com.yczuoxin.pattern.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        Car car = new Car();
        Ship ship = new Ship();
        VehicleWrapper carWrapper = new VehicleWrapper(car);
        carWrapper.move();

        VehicleWrapper shipWrapper = new VehicleWrapper(ship);
        shipWrapper.move();

        VehicleWrapper2 carWrapper2 = new VehicleWrapper2(carWrapper);
        carWrapper2.move();
    }

}
