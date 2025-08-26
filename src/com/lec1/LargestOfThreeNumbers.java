package com.lec1;

import java.util.Scanner;


public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = in.nextInt();
        System.out.println("Enter second number: ");
        int b = in.nextInt();
        System.out.println("Enter third number: ");
        int c = in.nextInt();

//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
//        System.out.println(max);


        //This is using java libraries
        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);

        //Above is the optimized code,
        //Below was my code which i tried.

        /*
        if(a > b){

            if(a > c){
                System.out.println("A is the greatest");
            }
        } else if (b > c) {
            if(b > a){
                System.out.println("B is the greatest");
            }

        } else {
            System.out.println("C is the greatest");
        }

        */
    }
}
