package com.arrays.demo;

public class MultiDimensionalArraysDemo {
    public static void main(String[] args) {
        // FOR THOUGH CLARITY
        // TWO DIMENSIONAL ARRAYS CAN BE COMPARED TO EXCEL ROWS AND COLUMNS
        // DATA_TYPE[][] VARIABLE_NAME =
        String[][] myStudentData = {
               {"firstName", "lastName", "email"},
//                  0,0         0,1        0,2
               {"vishnu", "vardhan", "vishnu@test.com"},
               {"prachi", "barsagade", "prachi@test.com"}
        };
        int[][] myTransactions = {
                {41, 43, 45},
                {300, 10, 150}
        };
    }
}
