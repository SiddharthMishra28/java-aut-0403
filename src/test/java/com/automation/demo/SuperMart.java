package com.automation.demo;

public class SuperMart {

    // BILL > 15000 - CUSTOMER - SILVER - DISCUNT - 5%
    // BILL > 20000 - CUSTOMER - GOLD - DISCUNT - 8%
    // BILL > 30000 - CUSTOMER - PLATINUM - DISCUNT - 10%
    // NEW GUY - SOME AMOUNT
    public static void main(String[] args) {
        int bill = 19999;
        String CUSTOMER_TYPE1 = "SLIVER";
        String CUSTOMER_TYPE2 = "GOLD";
        String CUSTOMER_TYPE3 = "PLATNUM";
        if(bill > 15000 && bill <= 20000) {
            System.out.println("CUSTOMER IS "+CUSTOMER_TYPE1);
            System.out.println(bill - 0.05*bill);
        }else if(bill> 20000 && bill < 30000) {
            System.out.println("CUSTOMER IS "+CUSTOMER_TYPE2);
            System.out.println(bill - 0.08*bill);
        }else if(bill> 30000) {
            System.out.println("CUSTOMER IS "+CUSTOMER_TYPE3);
            System.out.println(bill - 0.1*bill);
        }
    }
}
