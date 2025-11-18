package com.lec27;

public class OneToN {
    public static void main(String[] args) {
        int n = 5;
        funReverse(n);
    }

    static void funReverse(int n){
        if (n == 0){
            return;
        }
        funReverse(n-1);
        System.out.print(n + " ");
    }
}
