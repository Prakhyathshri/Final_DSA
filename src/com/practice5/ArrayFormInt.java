package com.practice5;

//https://leetcode.com/problems/add-to-array-form-of-integer/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayFormInt {

    public static void main(String[] args) {
        int[] num1 = {1, 2, 0, 0};
        int k1 = 34;

        int[] num2 = {2, 7, 4};
        int k2 = 181;

        int[] num3 = {2, 1, 5};
        int k3 = 806;

        System.out.println(addToArrayForm(num1, k1));
        System.out.println(addToArrayForm(num2, k2));
        System.out.println(addToArrayForm(num3, k3));

    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        int sum = 0;
        for (int i = 0; i < num.length; i++){
            sum = sum * 10 + num[i] ;
        }
        int added = sum + k;

        List<Integer> result= new ArrayList<>();
        while(added > 0){
            result.add(0, added % 10);
            added = added / 10;
        }
        return result;
    }
}
