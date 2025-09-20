package com.practice05;
//https://leetcode.com/problems/number-of-good-pairs/description/
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
    }

    static int numIdenticalPairs(int[] nums) {
        int pair = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (i < j){
                    if(nums[i] == nums[j]){
                        pair++;
                    }
                }
            }
        }
        return pair;
    }
}
