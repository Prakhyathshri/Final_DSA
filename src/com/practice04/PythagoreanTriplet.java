package com.practice04;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Suggested improvements - IT should usually be three separate numbers
        //Use functions

        //Input a three digit number
        System.out.print("Enter three digit number: ");
        int num = sc.nextInt();
        System.out.println("You have entered " + num);

        //If number is not three digit return and give invalid input
        int digits = String.valueOf(num).length();
        if (digits != 3) {
            System.out.println("Invalid input");
            return;
        }

        //Breaking down into single digits
        int c = num % 10;
        num = num / 10;
        int b = num % 10;
        num = num / 10;
        int a = num % 10;

        //Print the digits separately
        System.out.println("Digits are: " + a + " " + b + " " + c);

        //checking for largest of three numbers
        // x and y is taken to recognise the smaller numbers
        int largest = a;
        int x = b;
        int y = c;
        if (b > largest) {
            largest = b;
            x = a;
            y = c;
        }
        if (c > largest) {
            largest = c;
            x = a;
            y = b;
        }
        System.out.println("Largest number is: " + largest);

        //Actual condition check
        if (largest * largest == (x * x) + (y * y)) {
            System.out.println("It is Pythagorean Triplet");
        } else {
            System.out.println("It is not a Pythagorean Triplet");
        }
    }
}

