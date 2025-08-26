package com.practice1;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Indian rupees: ");
        float ind = sc.nextFloat();
        System.out.print("Enter the usd currency rate: ");
        float rate = sc.nextFloat();
        float usd = ind/rate;
        System.out.printf("%.3fRs is equal to %.3f$", ind, usd);
    }
}
