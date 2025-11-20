package com.practice07;
// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/

public class SpecialArray {
    public static void main(String[] args) {
        int[] nums = {0,4,3,0,4};
        System.out.println(specialArray(nums));
    }

    static int specialArray(int[] nums) {
        for (int i = 0; i <= nums.length; i++){
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i <= nums[j]){
                    count++;
                }
            }
            if(count == i){
                return i;
            }
        }
        return -1;
    }
}
