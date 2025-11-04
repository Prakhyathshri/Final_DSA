package com.practice06;
//https://leetcode.com/problems/search-insert-position/description/

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
//        Output: 2

//        int[] nums = {1,3,5,6};
//        int target = 2;
//        Output: 1

        System.out.println(checkPosition(nums, target));
    }

    static int checkPosition(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int mid = -1;
        while (start <= end){
            mid = start + (end - start) / 2;

            if (target == nums[mid]){
                return mid;
            } else if (target < nums[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return start;
    }
}
