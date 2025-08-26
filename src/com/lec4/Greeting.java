package com.lec4;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        greeting2("yuva");
        greeting();
    }

    static void greeting2(String name){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello " + name);
    }

    static void greeting(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name = sc.next();
        System.out.print("Hello " + name);
    }
}
