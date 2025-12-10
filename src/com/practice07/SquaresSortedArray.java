package com.practice07;
// https://leetcode.com/problems/squares-of-a-sorted-array/description/
import java.util.Arrays;

public class SquaresSortedArray {
    public static void main(String[] args) {
        int[]  nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i] * nums[i];
        }
//        System.out.println(Arrays.toString(ans));
        Arrays.sort(ans);
//        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
