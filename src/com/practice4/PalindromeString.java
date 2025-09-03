package com.practice4;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String a = sc.next();

        char[] arr = a.toCharArray();
        char[] copy = arr;
        System.out.println(Arrays.toString(copy));

        int e = arr.length - 1;
        for(int i = 0; i < arr.length; i++){
            char temp = arr[i];
            arr[i] = arr[e];
            arr[e] = temp;
            e--;
        }
        System.out.println(Arrays.toString(arr));


        if(copy == arr){
            System.out.println("Palindrome");
        }
    }
}
