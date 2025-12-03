package com.practice10;
// https://leetcode.com/problems/power-of-three/description/

public class PowerOfThreeRecursion {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(6));
    }

    static boolean isPowerOfThree(int n){
        if (n == 1){
            return true;
        }
        if (n % 3 != 0 || n <= 0){
            return false;
        }
        return isPowerOfThree(n/3);
    }
}
