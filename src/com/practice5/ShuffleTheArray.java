package com.practice5;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int count = 0;
        for (int i = 0; i < n ; i++){
            ans[count] = nums[i];
            count++;
            ans[count] = nums[i + n];
            count++;
        }
        return ans;
    }
}
