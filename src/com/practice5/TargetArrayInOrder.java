package com.practice5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArrayInOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));

    }

    static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            list.add(index[i], nums[i]);
        }
        int[] target = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}



