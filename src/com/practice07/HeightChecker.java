package com.practice07;
// https://leetcode.com/problems/height-checker/description/

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }

    static int heightChecker(int[] heights){
        int[] copy = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            copy[i] = heights[i];
        }
        int count = 0;
        Arrays.sort(heights);
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(heights));
        for(int i = 0; i < heights.length; i++){
            if (heights[i] != copy[i]){
                count++;
            }
        }
        return count;
    }
}
