package com.practice05;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }

    static int rob(int[] nums) {
        int s1 = 0;
        for (int i = 0; i < nums.length; i = i + 2){
            s1 = s1 + nums[i];
        }
        int s2 = 0;
        for (int i = 1; i < nums.length; i = i + 2){
            s2 = s2 + nums[i];
        }
        if (s1 > s2){
            return s1;
        } else {
            return s2;
        }
    }
}
