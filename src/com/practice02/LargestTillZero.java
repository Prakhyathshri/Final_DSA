package com.practice02;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class LargestTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = 0;
        int count = 0;

        while(count < 1){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if(num == 0){
                System.out.println("The largest is " + largest);
                break;
            } else {
                if(num > largest){
                    largest = num;
                }
            }
        }
    }
}
