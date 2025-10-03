package com.lec20;
//https://leetcode.com/problems/find-the-duplicate-number/description/

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,3,3,3,3};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++){
            if (nums[j] != j + 1){
                return nums[j];
            }
        }
        return -1;
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
