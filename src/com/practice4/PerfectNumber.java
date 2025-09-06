package com.practice4;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        if (num < 0){
            System.out.println("Invalid input");
            return;
        }

        if (num == 0){
            System.out.println("0 is not considered as perfect number");
            return;
        }

        for (int i = 1; i <= num/2; i++){
            if (num % i == 0){
                sum = sum + i;
                System.out.print(i + " ");
            }
        }

        System.out.println("Sum of divisors: " + sum);
        if(sum == num){
            System.out.println("It is a perfect number");
        } else {
            System.out.println("It is a NOT a perfect number");
        }


    }
}
