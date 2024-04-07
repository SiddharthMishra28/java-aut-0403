package com.automation.oop;

public class Computer {
    String pcName;
    public Computer(String pc){
        //                 ABCD
        this.pcName = pc;
        if(pc.equalsIgnoreCase("HP")){
            System.out.println("HP COMPUTER DETECTED");
        }
        this.switchComputerOn();
    }

    public void switchComputerOn() {
        System.out.println("Computer on");
    }

    public static void main(String[] args) {
        Computer ibmComputer = new Computer("ABCD");
    }
}
