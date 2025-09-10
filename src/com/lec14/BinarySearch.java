package com.lec14;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        //You can use negative and 0 also here in the array
        int[] arr = {3,4,12,23,34,48,67,123,456,782,1230};
        int target = 1;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

//        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0, end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
