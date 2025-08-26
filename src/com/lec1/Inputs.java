package com.lec1;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your roll number: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is: " + rollno);

        int a = 234_000_000;
        //This is how we use comma, this will automatically consider this as commma

        System.out.println("Enter ur name: ");
        String name = input.nextLine();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
