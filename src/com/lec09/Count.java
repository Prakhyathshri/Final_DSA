package com.lec09;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a big number: ");
        int num = sc.nextInt();
        System.out.print("Enter the number to count: ");
        int digit = sc.nextInt();
        int count = 0;

        while (num > 0) {
            int temp = num % 10;
            if (temp == digit) {
                count++;
            }
            num = num /10;

        }
        System.out.print(count);

    }
}