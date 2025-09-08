package com.lec12;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Matrix look like
        /*
            1 2 3
            4 5 6
            7 8 9
         */
        //Three rows and three columns
        //2D Array - SYNTAX

        int[][] arr = new int[3][];
        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //Here we dont have to specify column because, it is different
        int[][] arr2D = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        int[][] a = new int[3][3];
        // input and output of 2D arrays
        for(int row = 0; row < a.length; row++){
            //for each col in every row
            for(int col = 0; col < a[row].length; col++){
                System.out.print("a[" + row + "][" + col + "]: ");
                a[row][col] = sc.nextInt();
            }
        }
        for(int row = 0; row < a.length; row++){
            //for each col in every row
            for(int col = 0; col < a[row].length; col++){
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
        for(int row = 0; row < a.length; row++){
            System.out.println(Arrays.toString(a[row]));
        }
        System.out.println();
        //Enhanced FOR LOOP's
        for(int[] i : a){
            System.out.println(Arrays.toString(i));
        }

    }
}
