package com.practice05;
//https://leetcode.com/problems/plus-one/description/
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,2,9};
        int[] digits2 = {1, 2, 9};
        int[] digits3 = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
        System.out.println(Arrays.toString(plusOne(digits2)));
        System.out.println(Arrays.toString(plusOne(digits3)));
    }

    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] output = new int[digits.length + 1];
        output[0] = 1;
        return output;
    }
}
