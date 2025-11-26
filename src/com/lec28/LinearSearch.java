package com.lec28;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {9,3,2,9,1,18,9};
        int target = 9;
        System.out.println(linearSearch(arr, target, 0));
        System.out.println(linearSearchIndex(arr, target, 0));
        System.out.println(linearSearchIndexLast(arr, target, arr.length - 1));

        linearSearchAllIndex(arr, target, 0);
        System.out.println(list);

        System.out.println(linearSearchAllIndex2(arr, target, 0, new ArrayList<>()));
    }

    static boolean linearSearch(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || linearSearch(arr, target, index + 1);
    }

    static int linearSearchIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        } else {
            return linearSearchIndex(arr, target, index + 1);
        }
    }

    static int linearSearchIndexLast(int[] arr, int target, int index){
        if (index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        } else {
            return linearSearchIndexLast(arr, target, index - 1);
        }
    }
    // When Duplicate is present it will give the only first index where it is presnt

    static ArrayList<Integer> list = new ArrayList<>();
    static void linearSearchAllIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        linearSearchAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> linearSearchAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return linearSearchAllIndex2(arr, target, index + 1, list);
    }
}
