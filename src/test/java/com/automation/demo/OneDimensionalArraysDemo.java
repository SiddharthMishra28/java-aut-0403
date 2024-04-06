package com.automation.demo;

public class OneDimensionalArraysDemo {
    public static void main(String[] args) {
        String[] header = {"first name", "last name", "email", "phone"};
        //                       0             1          2         3
        System.out.println(header[3]);
        int[] rollNumbers = {22,45,1,56,34,76};
        System.out.println(rollNumbers[3]);
        System.out.println(header.length);
        System.out.println(rollNumbers.length);
    }
}
