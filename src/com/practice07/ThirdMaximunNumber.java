package com.practice07;
// https://leetcode.com/problems/third-maximum-number/description/

import java.util.ArrayList;
import java.util.Arrays;

public class ThirdMaximunNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(thirdMax(nums));
    }

    static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length <= 2) {
            return nums[nums.length - 1];
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);
        for (int i = 0; i <= nums.length - 1; i++){
            if (!ans.contains(nums[i])){
                ans.add(nums[i]);
            }
        }
        System.out.println(ans);
        if (ans.size() <= 2){
            return ans.getLast();
        } else {
            return ans.get(ans.size() - 3);
        }
    }
}
