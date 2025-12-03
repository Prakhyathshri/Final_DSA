package com.practice10;

public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(20));
    }

    static boolean isPowerOfFour(int n){
        if (n <= 0){
            return false;
        }
        while (n > 1){
            if (n % 4 != 0){
                return false;
            }
            n /= 4;
        }
        return true;
    }
}
