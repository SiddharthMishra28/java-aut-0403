package com.automation.demo;

public class AmusementPark {

    // SPLASH - 300 / person - < 5 yrs age and > 60 yrs not allowed
    // FERRY WHEEL - 200 / person - not allowed for persons > 65
    // MERRY GO ROUND - 100 / person - allowed for everyone
    // 4 member family - 2 childrens - 3 12 45 50
    // RIDES - SPLASH, MERRY GO ROUND
    // CALCULATE THE TOTAL BILL

    public static void main(String[] args) {
//        String ride1 = "SPLASH";
//        String ride2 = "FERRY WHEEL";
//        String ride3 = "MERRY GO ROUND";
//        int[] ages = {3, 12, 45, 50};
//        if(ages <=5 && ages>=60) {
//            System.out.println("People are not allowed to go into splash");
//        }
        // inputs
        int totalBill = 0;
        String rides = "SPLASH,MERRY GO ROUND";
        int[] ages = {3,12,45,50};
        String[] rideArray = rides.split(",");
        // {"SPLASH","MERRY GO ROUND"}
        //  0          1
        for(int i=0; i<rideArray.length; i++) {
            if(rideArray[i].equalsIgnoreCase("SPLASH")) {
                for(int j=0; j<ages.length; j++) {
                    if(ages[j] < 5 || ages[j] > 60) {
                        System.out.println("Persons with Age "+ages[j]+" not allowed");
                    }else {
                        totalBill+=300;
                    }
                }
            }else if(rideArray[i].equalsIgnoreCase("MERRY GO ROUND")) {
                // LOOP THE AGES AND CALCULATE BILL
                for(int age : ages) {
                    totalBill+=100;
                }
            }
        }
        System.out.println("Total bill is "+totalBill);
    }

}
