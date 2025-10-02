package com.practice06;

public class Power {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        System.out.println(myPow(x, n));
    }

    static double myPow(double x, int n) {
        long power = n;
        if (power < 0){
            power = -power;
        }
        double ans = 1;
        for (int i = 1; i <= power; i++){
            ans = ans * x;
        }
        if (n < 0) {
            ans = 1 / ans;
        }
        return ans;
    }
}
