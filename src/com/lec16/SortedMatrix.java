package com.lec16;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr, 42)));
    }

    static int[] binarySearch(int[][] matrix, int rows, int cstart, int cend, int target){

        while (cstart <= cend){
            int mid = cstart + (cend - cstart)/2;
            if (matrix[rows][mid] == target){
                return new int[]{rows, mid};
            } else if (matrix[rows][mid] < target){
                cstart = mid + 1;
            } else {
                cend = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        //Checks if the matrix is empty, returns -1 -1 if empty
        if (rows == 0){
            return new int[]{-1,-1};
        }
        //if there is only one row - condition
        if (rows == 1){
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cmid = cols/2;

        //Run the loop till two rows are remaining
        //When two adjacent rows come next to next
        //The condition will become false, and check inside two
        //the two rows remaining will always be
        // next to next, neighbours, rs < re - 1 \\\ 2 < 3- 1
        while (rStart < (rEnd - 1)){
            int rmid = rStart + (rEnd - rStart)/2;

            if (target == matrix[rmid][cmid]){
                return new int[]{rmid,cmid};
            }
            if (target < matrix[rmid][cmid]){
                rEnd = rmid;
            } else {
                rStart = rmid;
            } //remember not to use +1 or -1 as it a ROW
        }
        //now we have two rows and have to perform BS in 4 parts
        //search in 1st half
        if (target <= matrix[rStart][cmid - 1]){
            return binarySearch(matrix, rStart, 0, cmid - 1, target);
        }
        //search in 2nd half
        if (target >= matrix[rStart][cmid + 1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix, rStart, cmid + 1, cols - 1, target);
        }
        //search in 3rd half
        if (target <= matrix[rStart + 1][cmid - 1]){
            return binarySearch(matrix, rStart + 1, 0, cmid - 1, target);
        }
        //search in 4th half
        if (target >= matrix[rStart + 1][cmid + 1]){
            return binarySearch(matrix, rStart + 1, cmid + 1, cols - 1, target);
        }
        return new int[]{-1, -1};
    }

}
