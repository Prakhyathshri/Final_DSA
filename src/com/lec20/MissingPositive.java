package com.lec20;
//https://leetcode.com/problems/first-missing-positive/description/
// Amazon question

public class MissingPositive {
    public static void main(String[] args) {
        int[]  nums = {1,2,0};
        System.out.println(firstMissingPositive(nums));
    }

    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){
                return index + 1;
            }
        }
        //case 2 - when n is not present in the array
        return nums.length + 1;
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
