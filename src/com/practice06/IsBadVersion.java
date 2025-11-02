package com.practice06;
//https://leetcode.com/problems/first-bad-version/description/

public class IsBadVersion {
    public static void main(String[] args) {
        int n = 5;
        int bad = 4;
        System.out.println(firstBadVersion(n, bad));
    }

    static int firstBadVersion(int n, int bad) {
        int start = 1;
        int end = n;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid, bad) && !isBadVersion(mid - 1, bad)){
                return mid;
            } else if (isBadVersion(mid, bad)){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static boolean isBadVersion(int num, int bad){
        return num >= bad;
    }
}


