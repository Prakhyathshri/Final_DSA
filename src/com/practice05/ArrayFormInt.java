package com.practice05;

//https://leetcode.com/problems/add-to-array-form-of-integer/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFormInt {

    public static void main(String[] args) {
        int[] num1 = {1, 2, 0, 0};
        int k1 = 34;

//        int[] num2 = {2, 7, 4};
//        int k2 = 181;
//
//        int[] num3 = {2, 1, 5};
//        int k3 = 806;

        System.out.println(addToArrayForm(num1, k1));
//        System.out.println(addToArrayForm(num2, k2));
//        System.out.println(addToArrayForm(num3, k3));

    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        System.out.println(Arrays.toString(num));
        int n = 0;
        for (int i = 0; i <= num.length - 1; i++) {
            n = n * 10 + num[i];
        }
        n = n + k;
        System.out.println(n);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            list.add(0, n % 10);
            n /= 10;
        }
        return list;
    }

    /*
    while (i >= 0 || k > 0) {
    if (i >= 0) {
        k += num[i];  // add current digit + carry
        i--;
    }
    result.add(k % 10);  // store last digit
    k /= 10;             // carry for next step
}

     */
}
