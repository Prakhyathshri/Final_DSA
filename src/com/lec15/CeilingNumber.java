package com.lec15;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 1;
        System.out.println(ceilingOfNumber(arr, target));
    }
    static int ceilingOfNumber(int[] arr, int target){
        int start = 0, end = arr.length - 1;

        if (target > arr[end]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start) / 2;


            if (arr[mid] == target){
                return mid;
            } else if (target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return arr[start];

        //When the loop ends, start will point to the
        // smallest index where the element is >= target.
        //This is why you return start.
    }


}

