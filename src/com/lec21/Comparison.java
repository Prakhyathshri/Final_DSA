package com.lec21;

public class Comparison {
    public static void main(String[] args) {
        String a = "Yuva";
        String b = "Yuva";

        System.out.println(a == b);
        //True - It checks if two reference variable be pointing to the same object

        String c = new String("Yuva");
        String d = new String ("Yuva");
        System.out.println(c == b);
        //False - Bcz they are two different objects
        System.out.println(c.equals(d));
        //True - It will only check for the values
        //It doesn't care if the ref var are pointing to same object

//        System.out.println(c[0]); - This is not possible
        System.out.println(c.charAt(0));

    }
}
