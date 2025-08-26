package com.lec3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of day: ");
        int day = sc.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
                //The case will only break after 5
                // so till 5 it will keep on running
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }

        switch (day){
            case 1 -> {
                System.out.println("Monday");
                //Can use curly braces when I have multiple statements
            }
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter valid number");
        }


        System.out.println("Enter a name of fruit: ");
        String fruit = sc.next();
        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("Red fruit");
            case "grapes" -> System.out.println("Round fruits");
            default -> System.out.println("Please enter a valid fruit");
        }
//This is enhanced switch syntax
//When we do ALT + Enter - IDE will ask if it can enhance the old code
//This will have inbuilt break; in each and every case

        System.out.println("Enter a name of fruit: ");
        String fruit2 = sc.next();

        switch (fruit2){
            case "mango":
                System.out.println("King of fruits");
                break;
            case "apple":
                System.out.println("Red fruit");
                break;
            case "grapes":
                System.out.println("Round fruits");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }


        //using if else like this is not a clean code
        // so we need to use switch statements for these kind of things
        /*
        System.out.print("Enter fruit name: ");
        String fruit = sc.next();

        if(fruit.equals("mango")){
            System.out.println("King of fruits");
        }
        if(fruit.equals("apple")){
            System.out.println("Red fruit");
        }
        */
    }
}