package com.lec27;

public class NToOneOneToN {
    public static void main(String[] args) {
        int n = 5;
        merge(n);
    }

    static void merge(int n){
        if (n == 0){
            return;
        }
        System.out.print(n + " ");
        merge(n-1);
        System.out.print(n + " ");
    }
}
