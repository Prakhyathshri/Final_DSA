package com.lec27;

public class Nto1 {
    public static void main(String[] args) {
        int n = 10;
        fun(n);
        concept(n);
    }

    static void concept(int n){
        if (n == 0){
            return;
        }
        System.out.print(n + " ");
        concept(--n);
//        concept(n--);
//        n-- vs --n;
//        n-- wont work, it becomes infinite loop
    }

    static void fun(int n){
        if (n == 0){
            return;
        }
        System.out.print(n + " ");
        fun(n-1);
    }

    //        if (n == 1){
//            System.out.print(1);
//            return;
//        }  Both do the same job, we can do it in two ways
}
