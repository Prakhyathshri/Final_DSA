package com.practice06;
//https://leetcode.com/problems/valid-perfect-square/description/

public class PerfectSquare {
    public static void main(String[] args) {
        int num = 2147483647;
        System.out.println(isPerfectSquare(num));
    }

    static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num/2;

        while (start <= end){
            int mid = start + (end - start)/2;
            long square = (long)mid * mid;

            if (mid * mid == num){
                return true;
            } else if (square < num){
                start = mid + 1;
            } else if (square > num){
                end = mid - 1;
            }
        }
        return false;
    }
}
