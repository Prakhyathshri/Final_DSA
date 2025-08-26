package com.lec1;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int p = 0;
        int i = 2;
        while(i < num){
            if(num % i == 0){
                p = 1;
            }
            i++;
        }
        if(p == 0){
            System.out.println("It is prime");
        } else {
            System.out.println("It is not prime");
        }
    }
}
