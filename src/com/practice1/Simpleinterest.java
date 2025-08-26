package com.practice1;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principle amount: ");
        float amount = sc.nextInt();
        System.out.print("Enter the rate of interest: ");
        float rate = sc.nextInt();
        System.out.print("Enter the time in years: ");
        float time = sc.nextInt();
        float SI = (amount * rate * time) /100;
        System.out.println(SI);


    }
}
