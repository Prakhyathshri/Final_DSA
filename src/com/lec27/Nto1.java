package com.lec27;

public class Nto1 {
    public static void main(String[] args) {
        int n = 10;
        fun(n);
    }

    static void fun(int n){
        if (n == 0){
            return;
        }
//        if (n == 1){
//            System.out.print(1);
//            return;
//        }  Both do the same job, we can do it in two ways
        System.out.print(n + " ");
        fun(n-1);
    }
}
