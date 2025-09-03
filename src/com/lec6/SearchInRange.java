package com.lec6;

public class SearchInRange {
    public static void main(String[] args) {
        //Given an array, and search from particular index to particular index
        int[] arr = {18, 12, -3, 7, 14, 28};
        int start = 3;
        int end = 5;
        int target = 28;
        int found = searchrange(arr, start, end, target);
        System.out.println(found);
    }

    static int searchrange(int[] arr, int start, int end, int target){
        if( arr.length == 0){
            return -1;
        }
        for(int i = start; i <= end; i++){
            if( arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
