package com.practice07;
//https://leetcode.com/problems/sort-array-by-parity-ii/description/

import java.util.Arrays;

public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }

    static int[] sortArrayByParityII(int[] nums) {
        int e = 0;
        int o = 1;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                ans[e] = nums[i];
                e = e + 2;
            } else {
                ans[o] = nums[i];
                o = o + 2;
            }
        }
        return ans;
    }
}
