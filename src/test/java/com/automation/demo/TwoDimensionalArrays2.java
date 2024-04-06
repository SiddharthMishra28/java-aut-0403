package com.automation.demo;

public class TwoDimensionalArrays2 {
    public static void main(String[] args) {
        String[][] studentData = {
               {"first name", "last name", "email", "phone"},
               {"muskan", "gambhir", "muskan@test.com", "4280328409"},
               {"sid", "mishra", "sid@test.com", "628366812"},
                {"rollNo", "fav color", "address", "city"},
                {"380213", "blue", "pune", "pune"}
        };
        System.out.println(studentData.length);
        System.out.println(studentData[0].length);
        for(int i=0; i<studentData.length; i++){
            for(int j=0; j<studentData[i].length; j++) {
                System.out.println("Iterating for row "+i+" and column "+j+" with value : "+studentData[i][j]);
            }
        }
//        System.out.println(studentData[2][4]);
    }
}
