package com.lec11;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        swap(a, b); //This is not gonna change the code
//        System.out.println(a + " " + b);

//        String name = "Yuva";
//        System.out.println(changename(name));
//        System.out.println(name);
        //Original string is not getting changed because a copy is being
        // created called naam and an object is being created, but name is not getting changed and it is same

        int[] arr = {1,2,3,4};
        changearray(arr);
        System.out.println(Arrays.toString(arr));
        //But in arrays it is getting changes bcz a duplicate is not getting created rather
        //The address is being passes and given access and made change
    }

    static void changearray(int[] temp) {
        temp[0] = 9;
    }

    static String changename(String naam){
        naam = "Prakhyath";
        return naam;
    }

    static void swap(int a, int b){
        //swap numbers code
        int temp = a;
        a = b;
        b = temp;
    }
}