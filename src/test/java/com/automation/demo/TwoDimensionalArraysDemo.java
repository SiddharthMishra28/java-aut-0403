package com.automation.demo;

public class TwoDimensionalArraysDemo {
    public static void main(String[] args) {
        double[][] transactionAmounts = {
                {120, 130, 150, 130, 450},
                {110, 99, 78}
        };
        String[] names = {"jdlsakdj", "asdsald"}; // last index is n-1 where n is size of array
        System.out.println(names[1]);
        String[][] customerData = {
              {"Firstname", "lastName", "email", "comments", "some more comments"},
              {"sid", "mishra", "sid@test.com", "some garbage data", "some more"},
              {"vinay", "kumar", "vinay@test.com"}
        };
        System.out.println(customerData.length);
        for(int i=0; i<customerData.length; i++){
            for(int j=0; j<customerData[i].length; j++) {
                System.out.println(customerData[i][j]+" | ");
            }
            System.out.println();
        }
    }
}
