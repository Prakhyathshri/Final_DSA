package com.lec09;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 1;
        System.out.print("Enter the number to find: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 2; i <= n; i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(sum);
    }
}
