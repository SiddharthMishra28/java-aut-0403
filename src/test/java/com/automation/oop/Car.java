package com.automation.oop;


// IS-A
// HAS-A

public class Car extends Vehicle{

    int engineCapacity;
    public Car(String make, String model, String type, int engineCapacity){
        super(make, model, type);
        this.engineCapacity = engineCapacity;
    }
}
