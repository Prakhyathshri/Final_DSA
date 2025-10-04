package com.lec20;
//https://leetcode.com/problems/set-mismatch/description/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int c = nums[i] - 1;
            if (nums[i] != nums[c]){
                swap(nums, i , c);
            } else {
                i++;
            }
        }
        int[] ans = new int[2];
        for (int j = 0; j < nums.length; j++){
            if (j + 1 != nums[j]){
                ans = new int[]{nums[j], j + 1};
            }
        }

        return ans;
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
