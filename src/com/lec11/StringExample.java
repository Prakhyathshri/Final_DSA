package com.lec11;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String message = greet();
//        System.out.println(message);

        System.out.println("Enter your name: ");
        String hesaru = sc.next();
        String personalized = myGreet(hesaru);
        System.out.println(personalized);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }


    static String greet(){
        String greeting = "How are you? ";
        return greeting;
//            return 23;
        //required return type is string above is error
    }
}
