package com.arrays.demo;

public class ArraysAndLoops2 {
    public static void main(String[] args) {
        String[][] myStudentData = {
                {"firstName", "lastName", "email"},
//                  0,0         0,1        0,2
                {"vishnu", "vardhan", "vishnu@test.com", "hello", "some garbage"},
                {"prachi", "barsagade", "prachi@test.com", "some comment data", "another cell"}
        };
        System.out.println(myStudentData[1].length);
        for(int i=0; i<myStudentData.length; i++){
            for(int j=0; j<myStudentData[i].length; j++) {
                System.out.println(myStudentData[i][j]);
            }
        }
    }
}
