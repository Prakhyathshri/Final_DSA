package com.practice5;

//https://leetcode.com/problems/matrix-diagonal-sum/description/
public class MatrixDiagonalSum {
    public static void main(String[] args){
//        int[][] mat = {{1,2,3},
//                        {4,5,6},
//                        {7,8,9}}; //25

        int[][] mat = {{1,1,1,1},
                        {1,1,1,1},
                        {1,1,1,1},
                        {1,1,1,1}}; //8

        System.out.println(diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (i == j){
                    sum = sum + mat[i][j];
                }
            }
            int k = mat.length - 1 - i;
            if (!(i == k)){
                sum = sum + mat[i][k];
            }
        }
        return sum;
    }
}
