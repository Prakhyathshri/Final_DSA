package com.lec30;
// https://leetcode.com/problems/fibonacci-number/description/

public class FibRecursion {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }

    static int fib(int n) {
        return helper(n, 0, 1);
    }

    static int helper (int n, int temp1, int temp2){
        if (n == 0) return temp1;
        if (n == 1) return temp2;

        return helper(n - 1, temp2, temp1 + temp2);
    }
}
