package com.practice3;

import java.util.Scanner;

public class MaxMinThreeNumFun {
//    Define two methods to print the maximum and the minimum
//    number respectively among three numbers entered by the user.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.println("The three number entered are: " + a + " " + b + " " + c);
        int maximum = maxnum(a, b, c);
        int minimum = minnum(a, b, c);
        System.out.println("The largest of three numbers is: " + maximum);
        System.out.println("The smallest of three numbers is: " + minimum);

    }

    static int maxnum(int a, int b, int c){
        int more = a;
        if(b > more){
            more = b;
        }
        if(c > more){
            more = c;
        }
        return more;
    }
    static int minnum(int a, int b, int c){
        int less = a;
        if(b < less){
            less = b;
        }
        if(c < less){
            less = c;
        }
        return less;
    }

}
