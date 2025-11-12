package com.practice08;

import java.util.Scanner;

public class InputTillZero {
    public static void main(String[] args) {
        System.out.println(whichLarge());
    }

    static int whichLarge(){
        Scanner sc = new Scanner(System.in);
        int large = -1;
        while (true){
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            if (large < n){
                large = n;
            }
            if (n == 0){
                return large;
            }
        }
    }
}
