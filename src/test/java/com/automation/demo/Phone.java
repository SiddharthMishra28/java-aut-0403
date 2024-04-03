package com.automation.demo;

public class Phone {
    String make;
    String model;
    String color;
    int ramCapacity;
    String networkCarrier;

    @Override
    public String toString() {
        return "Phone{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", ramCapacity=" + ramCapacity +
                ", networkCarrier='" + networkCarrier + '\'' +
                '}';
    }
}
