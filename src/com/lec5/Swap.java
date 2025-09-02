package com.lec5;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,10,18};
        System.out.println(Arrays.toString(arr));

        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));

        System.out.println("Reverse an array");
        reverse(arr);
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    //This is a two pointer method, using start and end
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;

            //I can just call the swap function here
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
