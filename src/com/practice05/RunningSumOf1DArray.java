package com.practice05;
//https://leetcode.com/problems/running-sum-of-1d-array/description/
import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        int total = 0;
        for (int i = 0; i < nums.length; i++){
            total = total + nums[i];
            sum[i] = total;
        }
        return sum;
    }
}
