package com.lec26;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(4,8));
        System.out.println(hcf(4,8));
        System.out.println(lcm(9,18));
    }
    // Brute force method of HCF
    static int hcf  (int a, int b){
        int big;
        if (b > a){
            big = b;
        } else {
            big = a;
        }
        for (int i = big; i >= 1; i--){
            if (a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }

    static int gcd(int a, int b){
        if (a == 0){
            return b;
        }

        return gcd(b % a, a);
    }

    static int lcm(int a, int b){
        return a * b/gcd(a,b);
    }
}
