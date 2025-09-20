package com.practice04;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char x = sc.next().charAt(0);

        if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')){
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U'){
                System.out.println("It is a vowel");
            } else {
                System.out.println("It is a consonant");
            }
        } else {
            System.out.println("INVALID INPUT");
        }


    }
}
