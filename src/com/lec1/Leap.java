package com.lec1;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year to check: ");
        int year = sc.nextInt();
        if(year % 400 == 0) {
            System.out.println("LEAP");
        } else if (year % 100 == 0) {
                System.out.println("NOT LEAP");
        }else if(year % 4 == 0){
            System.out.println("LEAP");
        }
        else {
            System.out.println("NOT LEAP");
        }
    }
}
