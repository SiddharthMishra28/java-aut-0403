package com.arrays.demo;

public class SingleDimensionalArrays {
    public static void main(String[] args) {
        // DATA_TYPE[] VARIABLE_NAME =
        // DATA_TYPE[][] VARIABLE_NAME =
        // CAN BE COMPARED TO A SINGLE ROW IN AN EXCEL SHEET
        int[] myNumberArray = {1,4,8,5,67};
        // FOR ACCESSING BASED ON INDEX
        // INDEX ALWAYS STARTS WITH 0
        String[] myStudents = {"Vishnu", "Prachi"};
        //                         0         1
        System.out.println(myNumberArray[2]);
        System.out.println(myStudents[1]);
        System.out.println(myStudents.length);
        System.out.println(myNumberArray.length);
    }
}
