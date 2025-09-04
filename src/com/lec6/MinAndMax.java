package com.lec6;

public class MinAndMax {
    public static void main(String[] args) {

        int[] arr = {76, 343, 46, 11, 920, 123};
        int min = findMin(arr);
        System.out.println("minimum value is " + min);

        int max = findMax(arr);
        System.out.println("minimum value is " + max);
    }

    static int findMax(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (ans < arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }

    //assume arr length is not equal to 0
    static int findMin(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (ans > arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}
