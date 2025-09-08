package com.lec13;
//https://leetcode.com/problems/richest-customer-wealth/description/

public class MaxWealth {
    public static void main(String[] args) {

        int[][] accounts = {{1,5},
                            {7,3,},
                            {3,5}
        };

        System.out.println(maximumWealth(accounts));
    }


    //Can use enhanced for loop when you are not using the index anywhere
    //Using the i and j directly
    static int maximumWealth(int[][] accounts) {
        int x = Integer.MIN_VALUE;
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            if (sum > x){
                x = sum;
            }
        }
        return x;
    }
}
