package com.lec13;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 100;

        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static boolean linearSearch3(int[] arr, int target){
        //To return true if element exists, and false for all other cases

        if (arr.length == 0){
            return false;
        }
        for (int element : arr){
            if (element == target){
                return true;
            }
        }
        return false;

    }

    static int linearSearch2(int[] arr, int target){

        if (arr.length == 0){
            return Integer.MAX_VALUE;
        }
        //run FOR EACH Loop directly
        for (int element : arr){
            //check for element at every index if it is = target
            if (element == target){
                return element;
            }
        }
        //Because we cant return -1 as -1 may be the element
        return Integer.MAX_VALUE;


    }

    //search the arrays: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){

        if (arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        //This line will execute if none of the above line if executed
        //hence target not found
        return -1;

    }
}
