package com.practice06;
// https://leetcode.com/problems/arranging-coins/description/

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }

    static int arrangeCoins(int n){

        int i = 1;
        while (i <= n){
            n = n - i;
            i++;
        }
        return i - 1;
    }
}
