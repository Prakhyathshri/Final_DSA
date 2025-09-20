package com.practice02;

import java.util.Scanner;

public class ProductMinusSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int copy = num;
        int sum = 0, product = 1;

        while(num > 0){
            int i = num % 10;
            sum = sum + i;
            num = num / 10;
        }
        System.out.println("The sum of digits is: " + sum);

        while(copy > 0){
            int i = copy % 10;
            product = product * i;
            copy = copy / 10;
        }
        System.out.println("The product of digits is: " + product);

        int ans = product - sum;
        System.out.println("Final answer is: "+ ans);

    }
}
