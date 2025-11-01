package com.practice06;
//https://leetcode.com/problems/sqrtx/description/

public class SqrtLeetcode {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(mySqrt(x));
    }

    static int mySqrt (int x) {
            if (x == 0 || x == 1) {
                return x;
            }

            int start = 1;
            int end = x;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if ((long)mid * mid == x) {
                    return mid;
                } else if ((long)mid * mid > x) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            return end;

    }

}
