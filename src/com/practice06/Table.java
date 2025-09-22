package com.practice06;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter table number: ");
        int num = sc.nextInt();
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++){
            int ans = num * i;
            System.out.println(num + " * " + i + " = " + ans);
        }
    }
}
