package com.practice06;

public class Pat5 {
    public static void main(String[] args) {
        int n = 5;
        int m = 9;
        for (int i = 1; i <= n; i++){
            for (int j = n - i; j >= 1; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
