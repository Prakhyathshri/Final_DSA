package com.practice5;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highest = Integer.MIN_VALUE;
        for (int j : candies) {
            if (highest < j) {
                highest = j;
            }
        }
        List<Boolean> ans = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= highest) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}
