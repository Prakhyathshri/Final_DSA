package com.practice4;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        int num;

        if(start > end || start < 0 || end < 0){
            System.out.println("Invalid entry");
            return;
        }


        for (int i = start; i <= end; i++){
            if(isPrime(i)){
                System.out.print(i + " " );
            }
        }

    }

    static boolean isPrime(int num){
        if (num < 2){
            return false;
        }
        for (int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}

