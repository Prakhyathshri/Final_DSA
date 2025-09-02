package com.lec5;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
//        int maximum = max(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(maximum);

//        int range = range(arr, 3, 4);
//        System.out.println(range);


    }



    static int max(int[] arr){

        if (arr.length == 0){
            return -1;
        }

        int maxnum = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxnum){
                maxnum = arr[i];
            }
        }
        return maxnum;
    }

    static int range(int[] arr, int start, int end){

        if(end > start){
            return -1;
        }

        if(arr == null){
            return -1;
        }

        int maxnum = arr[0];
        for(int i = start; i <= end; i++){
            if(arr[i] > maxnum){
                maxnum = arr[i];
            }
        }
        return maxnum;
    }
}
