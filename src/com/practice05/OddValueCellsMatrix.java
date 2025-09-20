package com.practice05;

//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
public class OddValueCellsMatrix {
    public static void main(String[] args){
        int m = 2, n = 3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m, n, indices));
    }

    static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        for (int a = 0; a < indices.length; a++){
            int row = indices[a][0];
            int col = indices[a][1];

            for (int i = 0; i < n; i++){
                matrix[row][i]++;
            }

            for (int j = 0; j < m; j++){
                matrix[j][col]++;
            }
        }
        int count = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] % 2 == 1){
                    count++;
                }
            }
        }
        return count;
    }
}
