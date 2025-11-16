package com.practice03;

import java.util.Scanner;

public class CompundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter time in years: ");
        int t = sc.nextInt();
        System.out.println("Enter the compounding rate per year ");
        System.out.println("For Annually: Enter 1 ");
        System.out.println("For Semi - Annually: Enter 2 ");
        System.out.println("For Quarterly : Enter 3 ");
        System.out.println("For Monthly: Enter 4 ");
        System.out.println("For Daily: Enter 5 ");
        int c = sc.nextInt();
        int n = switch (c) {
            case 1 -> 1;
            case 2 -> 2;
            case 3 -> 4;
            case 4 -> 12;
            case 5 -> {
                yield 365;
            }
            default -> 1;
        };
        double result = 1;
        double base = (1 + (r / 100) / n );
        int exp = n * t;
        for(int i = 1; i <= exp; i++){
            result = base * result;
        }
        double a = p * result;
        System.out.printf("Amount after Interest = %.2f\n", a);
        double ci = a - p;
        System.out.printf("Compound Interest = %.2f" , ci);
    }
}
