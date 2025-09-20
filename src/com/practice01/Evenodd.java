package com.practice01;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("It is a even number");

        } else{
            System.out.println("It is a odd number");
        }
    }
}
