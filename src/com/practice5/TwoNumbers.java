package com.practice5;

import java.util.Arrays;

public class TwoNumbers {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    static int[] twoSum(int[] nums, int target){
        int[] ind = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if(i == j){
                    continue;
                } else {
                    if (nums[i] + nums[j] == target){
                        return new int[] {i, j};
                    }
                }
            }
        }
        return new int[] {-1, -1};
    }

}
