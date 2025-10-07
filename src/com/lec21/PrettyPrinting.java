package com.lec21;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.5682f;
        System.out.printf("Formatted number is %.2f", a);
        //This formatted string will also Round Off
        System.out.println();
        System.out.println(Math.PI);
        System.out.printf("Pie: %.3f", Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s and I am %s", "Yuva", "Cool");
    }
}
