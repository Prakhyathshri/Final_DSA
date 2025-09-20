package com.practice03;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a number to check armstrong: ");
//        int n = sc.nextInt();
//        int digitising = counting(n);
//        System.out.println(digitising + " digit number");
//        boolean isArm = armstrong(n);
//        System.out.println(isArm);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();
        for(int i = start; i <= end; i++){
            if(armstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static int counting(int n){
        int count = 0;
        if(n == 0){
            count = 1;
        } else {
            while(n > 0){
                n = n / 10;
                count++;
            }
        }
        return count;
    }

    static boolean armstrong(int n) {
        int digit = 0, sum = 0;
        int copy = n;
        int nd = counting(n);
        while(n > 0){
            digit = n % 10;
            int mul = 1;
            for(int i = 1; i <= nd; i++){
                mul = mul * digit;
            }
            sum = sum + mul;
            n = n / 10;
        }
        return sum == copy;
    }
}

