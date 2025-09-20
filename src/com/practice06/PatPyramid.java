package com.practice06;

public class PatPyramid {
    public static void main(String[] args) {
        int rows = 3;
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= rows - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
