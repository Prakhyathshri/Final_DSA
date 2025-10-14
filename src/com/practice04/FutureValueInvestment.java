package com.practice04;

import java.util.Scanner;

public class FutureValueInvestment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double p = sc.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double r = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int t = sc.nextInt();

        System.out.print("Enter number of times interest is compounded per year: ");
        int n = sc.nextInt();

        r = r / 100;

        double ans = p * power((1 + r/n), n * t);
        System.out.printf("The future value is: %.2f", ans);
    }

    static double power(double base, int pow){
        double ans = 1;
        for (int i = 1; i <= pow; i++){
            ans = ans * base;
        }
        return ans;
    }
}
