package com.lec13;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenNumberDigitsOpt {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};
        System.out.println(findEvenDigits(nums));

        //Checking if the digits function is working properly or not
        System.out.println(digit(-123));
        System.out.println(digit(0));
        System.out.println(digit(3456));

    }
    //OTHER OPTION - convert the num to string and take the length of the string

    static int findEvenDigits(int[] nums){
        int count = 0;
        for(int element : nums){
            if(even(element)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int element){
        int totalDigit = digit(element);
        return totalDigit % 2 == 0;
    }

    static int digit(int element){
        if (element < 0){
            element = element * -1;
        }
        if (element == 0){
            return 1;
        }

        int totalDigit = 0;
        while(element > 0){
            element /= 10;
            totalDigit++;
        }
        return totalDigit;
    }
}
