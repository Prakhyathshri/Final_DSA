package com.lec15;

//https://leetcode.com/problems/find-in-mountain-array/description/
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] mountainArr = {1,2,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(target, mountainArr));
    }

    static int findInMountainArray(int target, int[] mountainArr) {
        int start = 0, end = findPeak(mountainArr);

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target > mountainArr[mid]){
                start = mid + 1;
            } else if (target < mountainArr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        end = mountainArr.length - 1;
        start = findPeak(mountainArr);

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target > mountainArr[mid]){
                end = mid - 1;
            } else if (target < mountainArr[mid]){
                start = mid + 1;
            } else {
                return mid;
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
