package com.lec26;

public class BinarySearchSquareRoot{
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.println(findSRoot(n));
        System.out.println(findSRoot(n));
    }

    // for not perfect square

    // Works for Perfect square only
    static float findSRoot(int n){
        int start = 0; int end = n;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid * mid == n){
                return mid;
            } else if (mid * mid > n){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}