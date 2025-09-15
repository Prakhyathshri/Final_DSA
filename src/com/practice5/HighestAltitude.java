package com.practice5;
//https://leetcode.com/problems/find-the-highest-altitude/

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }

    static int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length + 1];
        int temp = 0;
        alt[0] = 0;
        for(int i = 0; i < gain.length; i++){
                temp = temp + gain[i];
                alt[i + 1] = temp;
        }
        int highest = Integer.MIN_VALUE;
        for(int i = 0; i < alt.length; i++){
            if(alt[i] > highest){
                highest = alt[i];
            }
        }
        //System.out.println(Arrays.toString(alt));
    return highest;
    }
}
