package com.lec21;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Prakhyath Shri";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());

//      name.
//      If we do name. we will get the list of all the methods we can find and make use of the required methods

        System.out.println(name.indexOf('a'));
        System.out.println("    Prakhyath   ".strip());
        //The extra space will be removed

        //Finally the original will not change
        //Because it is not modifying the original, it is creating the copy
        System.out.println(name);
    }
}
