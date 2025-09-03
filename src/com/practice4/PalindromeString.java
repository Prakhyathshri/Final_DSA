package com.practice4;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String a = sc.next();

        char[] arr = a.toCharArray();
        char[] copy = Arrays.copyOf(arr, arr.length);
        char[] reverse = new char[arr.length];
        System.out.println(Arrays.toString(copy));

        for(int i = 0; i < arr.length; i++){
            reverse[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(reverse));


        if(Arrays.equals(copy,reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
