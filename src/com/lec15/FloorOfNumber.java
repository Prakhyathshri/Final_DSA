package com.lec15;

public class FloorOfNumber {
    public static void main(String[] args){
        int[] arr = {2,3,5,9,14,16,18};
        int target = 1;
        System.out.println(floorOfNumber(arr, target));
    }
    static int floorOfNumber(int[] arr, int target){
        int start = 0, end = arr.length - 1;

        if (target < arr[start]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        /*
* Binary search will narrow down.
* When the loop ends, start will be just past the target’s possible location,
* and end will be pointing at the largest element smaller than or equal to target.
* That’s why returning end gives the correct floor.
         */
        }
        return end;
    }


}

