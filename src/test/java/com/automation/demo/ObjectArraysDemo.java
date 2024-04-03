package com.automation.demo;

public class ObjectArraysDemo {

    public static void main(String[] args) {
        Phone iphone = new Phone(); // RESERVE CERTAIN MEMORY FOR STORING A PHONE
        iphone.make = "Apple";
        iphone.model = "11";
        iphone.color = "white";
        iphone.ramCapacity = 2;
        iphone.networkCarrier = "Verizon";

        Phone[] myPhones = {iphone};
        for(int i=0; i<myPhones.length; i++) {
            System.out.println(myPhones[i].toString());
        }
    }
}
