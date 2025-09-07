package com.lec6;

import java.util.Arrays;

public class Basics2D {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56}
        };

        int target = 34;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

        System.out.println(Arrays.toString(max(arr)));
        System.out.println(Arrays.toString(min(arr)));
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int[] max(int[][] arr) {
        int maxvalue = Integer.MIN_VALUE;
        int row = -1, col = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > maxvalue){
                    maxvalue = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{maxvalue, row, col};
    }

    static int[] min(int[][] arr) {
        int minvalue = Integer.MAX_VALUE;
        int row = -1, col = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < minvalue){
                    minvalue = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{minvalue, row, col};
    }
}