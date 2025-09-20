package com.practice05;

import java.util.Arrays;

//https://leetcode.com/problems/transpose-matrix/description/
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        //Output: [[1,4,7],[2,5,8],[3,6,9]]
        System.out.println(Arrays.deepToString(transpose(mat)));
        System.out.println(Arrays.deepToString(transpose(mat1)));
    }

    static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] temp = new int[col][row]; //3//2

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                temp[j][i] = matrix[i][j];
            }
        }
        return temp;
    }
}
