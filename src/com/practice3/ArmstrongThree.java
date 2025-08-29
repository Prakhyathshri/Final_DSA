package com.practice3;

import java.util.Scanner;

public class ArmstrongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //To check armstrong for given three digit input number
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        System.out.println(armstrong(n));

        //To check armstrong for all three digit number
        for(int i = 100; i <= 1000; i++){
            if(armstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean armstrong(int n) {
        int original = n;
//        int rem = 0;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        return original == sum;
//        if(original == sum){
//            return true;
//        } else {
//            return false;
//        }
    }
}
