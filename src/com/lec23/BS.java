package com.lec23;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,55,66,78};
        int target = 0;
        int ans = search(arr,target,0, arr.length);
        System.out.println(ans);
    }

    static int search (int[] arr, int target, int s, int e){
        if (s > e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if (target == arr[m]) {
            return m;
        } else if (target < arr[m]){
            return search(arr, target, s, m - 1);
        } else {
            return search(arr, target, m + 1, e);
        }
    }
}
