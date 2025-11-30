package com.lec29;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        selectSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void selectSort(int[] arr, int r, int c, int max){
        if (r == 0){
            return;
        }
        if (c < r){
            if (arr[c] > arr[max]){
                selectSort(arr, r, c + 1, c);
            } else {
                selectSort(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;

            selectSort(arr, r - 1, 0, 0);
        }
    }
}
