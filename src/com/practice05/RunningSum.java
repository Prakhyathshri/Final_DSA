package com.practice05;
//https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        int tempSum = 0;
        for (int i = 0; i < nums.length; i++){
            tempSum = tempSum + nums[i];
            sum[i] = tempSum;
        }
        return sum;
    }
}
