package com.practice02;

import java.util.Scanner;
//Take integer inputs till the user enters 0 and print the sum of all numbers

public class SumTillZero {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int sum = 0, num = 1;
        while(num > 0){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number to add: ");
            int i = sc.nextInt();
            if(i == 0){
                System.out.println("Sum is: " + sum);
            } else {
                sum = sum + i;
            }
        }
        System.out.println("Sum is: " + sum);

    }
}
