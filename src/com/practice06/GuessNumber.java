package com.practice06;
//https://leetcode.com/problems/guess-number-higher-or-lower/description/

public class GuessNumber {
    public static void main(String[] args) {
        int n = 10;
        int pick = 6;
        System.out.println(guessNumber(n, pick));
    }

    static int guessNumber(int n, int pick) {
        int start = 1;
        int end = n;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (guess(mid, pick) == 0){
                return mid;
            } else if (guess(mid, pick) == 1){
                start = mid + 1;
            } else if (guess(mid, pick) == -1){
                end = mid - 1;
            }
        }
        return -1;
    }

    static int guess(int num, int pick){
        if (num < pick){
            return 1;
        } else if (num > pick){
            return -1;
        } else {
            return 0;
        }
    }
}
