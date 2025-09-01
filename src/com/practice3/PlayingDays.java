package com.practice3;

import java.util.Scanner;

public class PlayingDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month in numbers: ");
        int month = sc.nextInt();
        if(month > 12 || month < 1){
            System.out.println("Invalid input");
        }
        int nd = days(month);
        System.out.println("Number of days is " + nd);

        int even = 0;
        for(int i = 1; i <= nd; i++){
            if(i % 2 == 0){
                even++;
            }
        }
        System.out.println("Number of days child can play is " + even);
    }

    static int days(int month){
        int days;
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            days = 31;
            return days;
        } else if (month == 2) {
            days = 28;
            return days;
        } else {
            days = 30;
            return days;
        }
    }
}

//Improvements possible
// 1. Leap year check
// 2. Switch statements instead of if else
