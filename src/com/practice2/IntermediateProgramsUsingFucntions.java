package com.practice2;

import java.util.Scanner;

public class IntermediateProgramsUsingFucntions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        cgpa();
//        depreciation();
//        power();
//        discount();
//        avgOfNum();
    }

    static void cgpa(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total subjects: ");
        int sub = sc.nextInt();
        float tc = 0, tg = 0;

        for(int i = 1; i <= sub; i++){
            System.out.print("Enter the credit of the " + i + " subject: ");
            int credit = sc.nextInt();
            System.out.print("Enter the points of the " + i + " subject: ");
            int point = sc.nextInt();
            int gradepoint = credit * point;
            tc = tc + credit;
            tg = tg + gradepoint;
        }
        System.out.println("Total credits appeared is: " + tc);
        System.out.println("Total points secured is: " + tg);
        float cgpa = tg/tc;
        System.out.printf("CGPA = %.2f", cgpa);
    }

    static void depreciation(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial cost: ");
        double cost = sc.nextDouble();
        System.out.print("Enter the rate of depreciation: ");
        double per = sc.nextDouble();
        System.out.print("Enter the years: ");
        int years = sc.nextInt();

        for(int i = 1; i <= years; i++){
            cost = cost - ((per * cost)/100);
        }
        System.out.printf("The final value after %d years is %.2f", years, cost);

    }

    static void power(){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent number: ");
        int exponent = sc.nextInt();
        float value = 1;

        for(int i = 1; i <= exponent; i++){
            value = value * base;
        }
        System.out.println(base + " raised to " + exponent + " is " + value);

    }

    static void discount(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the discount in percentage: ");
        int per = sc.nextInt();
        System.out.print("Enter the total amount: ");
        float total = sc.nextFloat();

        float bill = total - ((total * per)/100);
        System.out.println("The total bill is " + total);
        System.out.println("The final bill after discount is " + bill);
    }

    static void avgOfNum(){
        Scanner sc = new Scanner(System.in);
        int i = 0, total = 0;
        float avg = 0;
        System.out.println("Enter 0 to exit");

        while(true){
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            if(num == 0){
                if(i==0){
                    System.out.println("Total is 0");
                    System.out.println("Average is 0");
                    break;
                } else {
                    avg = total/i;
                    System.out.println("Total is " + total);
                    System.out.println("Average is " + avg);
                    break;
                }
            } else {
                i++;
                total = num + total;
            }
        }

    }
}

