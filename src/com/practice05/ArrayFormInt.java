package com.practice05;

//https://leetcode.com/problems/add-to-array-form-of-integer/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFormInt {

    public static void main(String[] args) {
        int[] num1 = {1, 2, 0, 0};
        int k1 = 34;
        addToArrayForm(num1);
        System.out.println(num1);
    }

    static void addToArrayForm(int[] num) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = num.length - 1; i <= 0; i--){
            list.add(num[i]);
        }

        System.out.println(list);
    }
}
