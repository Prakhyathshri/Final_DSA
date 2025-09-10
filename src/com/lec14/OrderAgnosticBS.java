package com.lec14;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        //For Ascending order array
//        int[] arr = {3,4,12,23,34,48,67,123,456,782,1230};

        //For Descending order array
        int[] arr = {9098, 7866, 453, 234, 123, 0, -1, -34, -342};

        int target = 234;

        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0, end = arr.length - 1;

        //Find whether the array is sorted in Ascending or Descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
