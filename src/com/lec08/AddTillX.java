package com.lec08;

import java.util.Scanner;


public class AddTillX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        while (total >= 0) {
            System.out.print("Enter x to exit, y to continue: ");
            char ch = sc.next().trim().charAt(0);
            if(ch == 'x' || ch == 'X'){
                break;
            } else if (ch == 'y' || ch == 'Y'){
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                total = total + num;
            }


        }
        System.out.printf("Sum is %d", total);
    }
}
