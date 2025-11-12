package com.lec25;

public class UniqueCheck {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,3,4,6};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for (int n : arr){
            unique ^= n;
//            unique = unique ^ n;
//            Here all the elements of the array will be converted into
//            binary and then the XOR operation will be performed on it
        }

        return unique;
    }
}
