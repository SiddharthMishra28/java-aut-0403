package com.automation.oop;

public class Laptop extends Computer{
    public Laptop(String pcName) {
        super(pcName);
    }

    public static void main(String[] args) {
        Laptop hpLaptop = new Laptop("HP");
    }
}
