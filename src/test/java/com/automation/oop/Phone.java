package com.automation.oop;

public class Phone {
    String model;
    String color;
    int storage;
    int screenSize;
    String make;
    int ramCapacty;
    String networkCarrier;
    String[] defaultApps;

    public void switchOn() {
    //<ACCESS SPECIFIER>  <RETURN TYPE>  <METHOD NAME / FUNCTION NAME>
        System.out.println("Phone Switched On!");
    }

    public void switchOff() {
        System.out.println("Phone Switched off!");
    }

    public void dialCall(String phoneNumber) {
        System.out.println("Dialing Number "+phoneNumber+" using "+this.networkCarrier);
    }

    public static void main(String[] args) {
        Phone Iphone11 = new Phone();
        Iphone11.make = "Apple";
        Iphone11.model = "I11";
        Iphone11.screenSize = 6;
        Iphone11.color = "White";
        Iphone11.networkCarrier = "verizon";
        Iphone11.defaultApps = new String[]{"calendar", "appstore", "apple fit"};
        Iphone11.ramCapacty = 2;
        Iphone11.switchOn();
        Iphone11.dialCall("9876354525");
        Iphone11.switchOff();

        Phone Iphone13 = new Phone();
        Iphone13.make = "Apple";
        Iphone13.model = "I13";
        Iphone13.screenSize = 7;
        Iphone13.color = "Rose Gold";
        Iphone13.networkCarrier = "Vodafone";
        Iphone13.defaultApps = new String[]{"calendar", "appstore", "whatsapp"};
        Iphone13.switchOn();
        Iphone13.dialCall("7394927394");
        Iphone13.switchOff();
    }
}
