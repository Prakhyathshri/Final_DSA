package com.lec15;

//https://leetcode.com/problems/find-in-mountain-array/description/
public class FindMountArraySolution {
    public static void main(String[] args) {
        int[] mountainArr = {1,2,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(target, mountainArr));
    }

    static int findInMountainArray(int target, int[] mountainArr) {
        int peak = findPeak(mountainArr);

        int firsttry = orderAgnosticBS(mountainArr, target, 0, peak);
        if (firsttry != -1){
            return firsttry;
        }
        return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length - 1);
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        //Find whether the array is sorted in Ascending or Descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int findPeak(int[] arr){
        int start = 0, end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] < arr[mid + 1]){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
