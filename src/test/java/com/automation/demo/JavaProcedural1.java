package com.automation.demo;

public class JavaProcedural1 {
    public static void main(String[] args) {
        // TOLL GATE - 3 ROUTES
        // 1st ROUTE - 150 KMS - 75/- Hyderabad
        // 2nd ROUTE - 300 KMS - 120/- Srikalkullam
        // 3rd ROUTE - 450 KMS - 180/- Vijayawada
        //             DISTANCE  PRICE  PLACE
        int tollAmount = 0;
        String input = "vijayawada,Srikakulam";
        String[] places = input.split(",");
        for(int i=0; i<places.length; i++) {
            if(places[i].equalsIgnoreCase("Hyderabad")) {
                tollAmount = tollAmount + 75;
            }else if(places[i].equalsIgnoreCase("Srikakulam")) {
                tollAmount = tollAmount + 120;
            }else if(places[i].equalsIgnoreCase("Vijayawada")) {
                tollAmount = tollAmount + 180;
            }
        }
        System.out.println("Your Toll Amount is "+tollAmount);
    }

    // AMUSEMENT PARK
    // WATER SPLASH RIDE - 350 per head - NOT ALLOWED FOR PERSON < 5 yrs or > 60 yrs
    // FERRY WHEEL - 200 per head - ALLOWED FOR ALL
    // MERRY GO ROUND - 120 per head - ALLOWED TO ALL
    // INPUTS - No of Persons, Age, RIDE
    // CALCULATE BILL

    // BILLING & INVOICING COMPANY - USER IS ALLOWED TO SWITCH TO AUDIO AND VIDEO WITHIN A CALL!
    // INTERNATIONAL CALLS - 1.2INR / min
    // DOMESTIC CALLS - 0.5 INR / min
    // INTERNATIONAL CALLS WITH VIDEO - 5 INR / min
    // DOMESTIC CALLS WITH VIDEO - 2 INR / min
    // CALCULATE BILL FOR ENTIRE DURATION

}
