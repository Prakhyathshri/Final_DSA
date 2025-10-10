package com.lec23;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        //write a fxn that takes a number and prints it
        //print first 5 numbers: 1 2 3 4 5

        print(1);
    }

    static void print(int n){
        if (n == 6){
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
