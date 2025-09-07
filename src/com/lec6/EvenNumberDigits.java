package com.lec6;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenNumberDigits {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};
        System.out.println(findEvenDigits(nums));

    }
    //IMPROVEMENTS - create a function of counting digits and then return true, if true, count++
    //OTHER OPTION - convert the num to string and take the length of the string

    static int findEvenDigits(int[] nums){
        int a = 0;

        for (int i = 0; i < nums.length; i++){
            int count = 0;
            int x = nums[i];

            while(x > 0){
                x = x / 10;
                count++;
            }

            if(count % 2 == 0){
                a++;
            }
        }

        return a;
    }
}
