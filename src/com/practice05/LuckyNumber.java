package com.practice05;
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static void main(String[] args) {
        int[][] matrix = {{4, 2, 3}, {1, 8, 5}, {9, 7, 6}};
        System.out.println(luckyNumbers(matrix));
    }

    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int i = 0;

        while (i < matrix.length) {
            int small = matrix[i][0];
            int col = 0;

            for (int j = 1; j < matrix[i].length; j++) {
                if (small > matrix[i][j]) {
                    small = matrix[i][j];
                    col = j;
                }
            }

            boolean isLucky = true;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][col] > small) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) {
                list.add(small);
            }
            i++;
        }
        return list;
    }
}
