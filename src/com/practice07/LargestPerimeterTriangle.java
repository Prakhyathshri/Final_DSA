package com.practice07;
// https://leetcode.com/problems/largest-perimeter-triangle/description/

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] nums = {2,1,2};
        System.out.println(largestPerimeter(nums));
    }

    static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2 ; i--) {
            int c = nums[i];
            int b = nums[i - 1];
            int a = nums[i - 2];

            if (a + b > c){
                return a + b + c;
            }
        }
        return 0;
    }
}
