package com.lec15;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {7,8,1,2,5,6};
        int target = 1;
        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {
        int peak = findPivot(nums);
        int ans = -1;
        if (target >= nums[0]){
            ans = binarySearch(nums, target, 0, peak);
        } else {
            ans = binarySearch(nums, target, peak + 1, nums.length - 1);
        }
        return ans;
    }

    static int binarySearch(int[] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
