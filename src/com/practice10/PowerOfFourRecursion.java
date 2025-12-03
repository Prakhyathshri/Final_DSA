package com.practice10;
// https://leetcode.com/problems/power-of-four/description/

public class PowerOfFourRecursion {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(29));
    }

    static boolean isPowerOfFour(int n){
        if (n == 1) {
            return true;
        }
        if (n % 4 != 0 || n <= 0){
            return false;
        }
        return isPowerOfFour(n/4);
    }
}
