package com.lec21;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);

        System.out.println(new int[]{1,2,3});
        //This will print the unknown random value
        //This is the memory address of where it is stored

        System.out.println(Arrays.toString(new int[]{1,2,3}));
        //This will override the normal to string and use Arrays.toString function to print it
        //Default function is being OVERRIDDEN here

        System.out.println("Yuva");

        String name = null;
        System.out.println (name);
    }
}
