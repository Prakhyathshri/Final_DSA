package com.practice07;
// https://leetcode.com/problems/sort-array-by-parity/description/

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    static int[] sortArrayByParity(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                ans[s] = nums[i];
                s++;
            } else {
                ans[e] = nums[i];
                e--;
            }
        }
        return ans;
    }
}
