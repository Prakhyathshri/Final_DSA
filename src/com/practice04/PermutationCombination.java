package com.practice04;

public class PermutationCombination {
    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        System.out.printf("Permutation of %dP%d is: %.2f",n, r, per(n, r));
        System.out.println();
        System.out.printf("Combination of %dC%d is: %.2f",n, r, com(n, r));
        System.out.println();

    }

    static double per (int n, int r){
        return cal(n)/cal(n - r);
    }

    static double com (int n, int r){
        return cal(n)/(cal(r) * cal(n - r));
    }

    static long cal(int num){
        long x = 1;
        for (int i = 1; i <= num; i++){
            x = x * i;
        }
        return x;
    }
}
