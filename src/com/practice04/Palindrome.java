package com.practice04;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int original = a;
        int reverse = 0;

        while (original != 0){
            int temp = original % 10;
            reverse = (reverse * 10) + temp;
            original = original / 10;
        }
        System.out.println("Original number: " + a);
        System.out.println("Reversed number: " + reverse);
        if(a == reverse){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
