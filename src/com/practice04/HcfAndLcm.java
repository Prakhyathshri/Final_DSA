package com.practice04;

public class HcfAndLcm {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        System.out.printf("HCF of %d and %d is: %d", a, b, hcf(a, b));
        System.out.println();
        System.out.printf("LCM of %d and %d is: %d", a, b, lcm(a, b));
        System.out.println();
    }

    static int hcf(int a, int b){
        int hcfans = 1;
        for (int i = 1; i <= a && i <= b; i++){
            if (a % i == 0 && b % i == 0){
                hcfans = i;
            }
        }
        return hcfans;
    }

    static int lcm(int a, int b){
        int lcmans = (a * b)/hcf(a,b);
        return lcmans;
    }

}
