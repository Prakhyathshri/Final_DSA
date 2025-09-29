package com.practice07;

import java.util.Arrays;
//Merge Sorted Array - Own Solution, Not Optimized
//https://leetcode.com/problems/merge-sorted-array/description/
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = 0;
        for (int i = m; i < nums1.length; i++){
            nums1[i] = nums2[x];
            x++;
        }
        System.out.println(Arrays.toString(nums1));

        insertSort(nums1);
    }

    static void insertSort(int[] nums1){
        for (int i = 0; i < nums1.length - 1; i++){
            for (int j = i + 1; j < nums1.length; j++){
                if (nums1[i] > nums1[j]){
                    swap(nums1, i , j);
                }
            }
        }
    }

    static void swap (int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
