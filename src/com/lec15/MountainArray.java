package com.lec15;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/1775280668/
public class MountainArray {
        public static void main(String[] args) {

            int[] arr = {0,2,1,0};
            System.out.println(highest(arr));
        }

        static int highest(int[] arr){
            int start = 0, end = arr.length - 1;

            while(start < end){
                int mid = start + (end - start) / 2;
                if (arr[mid + 1] > arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
            return start;
        }


}

