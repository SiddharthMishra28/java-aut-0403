package com.demo.oop.pillars;

// extends - IS-A relationship / Parent child relationship
public class Car extends Vehicle{
    int engineCapacity;
    int numGears;

    public void moveVehicle(int speed) {
        System.out.println("Vehicle started at "+speed+ "km / h");
    }

    public static void main(String[] args) {
        Car car = new Car();
    }
}
