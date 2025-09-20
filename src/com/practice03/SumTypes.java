package com.practice03;

import java.util.Scanner;

public class SumTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 to exit");
        int check = 1;
        int nn = 0, pen = 0, pon = 0;

        while(check > 0){
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if(num == 0){
                break;
            }
            else if (num > 0){
                if (num % 2 == 0){
                    pen = pen + num;
                }
                else {
                    pon = pon + num;
                }
            } else {
                nn = nn + num;
            }
        }
        System.out.println("Sum of Negative numbers is: " + nn);
        System.out.println("Sum of Positive Even numbers is: " + pen);
        System.out.println("Sum of Positive Odd numbers is: " + pon);
    }
}
