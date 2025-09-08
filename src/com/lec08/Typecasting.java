package com.lec08;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num2 = 'A';
        System.out.println(num2);

//        automatic type promotion of expressions
        int a = 257;
        byte b = (byte)(a);
        //This will give one, max range of byte is 256, the result will be the reminder of the remaining value
        //257 % 256 = 1

        byte aa = 40;
        byte bb = 50;
        byte cc = 100;
        int dd = aa * bb / cc;
        System.out.println(dd);
        //The operation will be performed in the int not in byte
        //so it will automatically convert it into int



//        type casting
        int num1 = (int)(23.34f);
        System.out.println(num1);


        float num = input.nextFloat();
        System.out.println(num);
    }
}
