package com.lec28;

public class RotatedBSRecursion {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,11,1,2,3};
        System.out.println(search(arr, 11, 0, arr.length - 1));
    }

    static int search (int[] arr, int target, int s, int e){
        if (s > e){
            return -1;
        }

        int m = s + (e - s) / 2;
        if (arr[m] == target){
            return m;
        }

        if (arr[s] <= arr[m]){                         // LEFT HALF is sorted
            if (target >= arr[s] && target <= arr[m]){ // target in left
                return search(arr, target, s, m - 1);
            } else {                                   // target in right
                return search(arr, target, m + 1, e);
            }
        } else {                                       // RIGHT HALF is sorted
            if (target >= arr[m] && target <= arr[e]){ // target in right
                return search(arr, target, m + 1, e);
            } else {                                   // target in left
                return search(arr, target, s, m - 1);
            }
        }



    }
}
