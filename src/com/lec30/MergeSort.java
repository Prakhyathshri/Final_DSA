package com.lec30;

import java.sql.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        // It returns a new Array, so we are updating the original array like this
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        // It is creating new object for every function call
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // It may be possible that one of the array still have elements
        // Copy the remaining elements
        while (i < first.length){
            mix[k] = first[i];
            k++;
            i++;
        }
        while (j < second.length){
            mix[k] = second[j];
            k++;
            j++;
        }
        return mix;
    }
}
