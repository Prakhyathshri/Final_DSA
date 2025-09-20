package com.practice06;

import java.util.Scanner;

public class Pat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ending digit: ");
        int end = sc.nextInt();

        for (int i = 1; i <= end; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
