package com.methods.demo;

public class MathUtils {

    // <ACCESS MODIFIER> <RETURN TYPE> <NAME OF METHOD>(<AGRS..>){
    // ......
    // }
    public double calcCircleArea(float radius){
        return Math.PI * radius * radius;
    }

    public String getUptoThreeDecimalPlaces(double doubleNumber) {
        String value = String.valueOf(doubleNumber);
        return value.substring(0, 6);
    }

    public String calcTriangleArea(double base, double height) {
        return this.getUptoThreeDecimalPlaces(0.5 * base * height);
    }

    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();
        mathUtils.getUptoThreeDecimalPlaces(mathUtils.calcCircleArea(6));
    }
}
