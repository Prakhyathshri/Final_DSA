package com.lec08;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = "Hello world!";
        System.out.println(word.charAt(0));
        //This will print the character of the String word at 0th index
        //Trim will remove all the blank spaces of a string before and after

        System.out.print("Enter an character: ");
        char ch = sc.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("It is a lower case");
        } else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("It is a upper case");
        } else {
            System.out.println("Not an alphabet");
        }

    }
}
