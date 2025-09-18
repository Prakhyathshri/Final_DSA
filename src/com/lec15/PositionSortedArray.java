package com.lec15;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class PositionSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1, -1};

        ans[0] = getindex(nums, target, true);
        if (ans[0] != -1){
            ans[1] = getindex(nums, target, false);
        }
        return ans;
    }

    static int getindex(int[] nums, int target, boolean isFirstIndex) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (target == nums[mid]){
                ans = mid;
                if (isFirstIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target < nums[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
