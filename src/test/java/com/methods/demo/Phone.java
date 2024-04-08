package com.methods.demo;

public class Phone {
    String make;
    String model;
    int ramCapacity;
    String operatingSystem;
    float screenSize;
    String networkCarrier;

    public void switchOnDevice() {
        if(this.operatingSystem.equalsIgnoreCase("IOS")) {
            System.out.println("Powering on your IOS device");
        }else {
            System.out.println("Welcome to Android");
        }
    }

    public void switchOffDevice() {
        System.out.println("Phone Switched Off!");
    }

    public void dialANumber(String number) {
        this.switchOnDevice();
        System.out.println("Calling "+number);
    }

    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.make = "Apple";
        iphone.model = "iphone 12";
        iphone.operatingSystem = "IOS";
        iphone.ramCapacity = 2;
        iphone.screenSize = 6.0f;
        iphone.networkCarrier = "JIO";
        iphone.switchOnDevice();
        iphone.dialANumber("3974392734");
        iphone.switchOffDevice();

        Phone samsungPhone = new Phone();
        samsungPhone.make = "Samsung";
        samsungPhone.model = "Samsung s22";
        samsungPhone.operatingSystem = "Android";
        samsungPhone.ramCapacity = 8;
        samsungPhone.screenSize = 6.0f;
        samsungPhone.networkCarrier = "Vodafone";
        samsungPhone.switchOnDevice();
    }
}
