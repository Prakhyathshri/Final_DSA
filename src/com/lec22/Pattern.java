package com.lec22;

public class Pattern {
    public static void main(String[] args) {
        int n = 4;
//        pat1(n);
//        pat2(n);
//        pat3(n);
//        pat4(n);
//        pat5(n);
//        pat6(n);
//        pat30(n);
        pat31(n);
    }

    static void pat31(int n){
        for (int i = 0; i < 2 * n - 1; i++){
            int ele = 0;
            for (int j = 0; j < 2 * n - 1; j++){
                if (i == j){
                    ele++;
                }
                System.out.print(ele);
            }
            System.out.println();
        }
    }


//    static void pat17 (int n){
//        for (int i = 1; i < 2 * n; i++){
//            int space = n - i;
//            for (int j = 1; j <= space; j++){
//                System.out.print("  ");
//            }
//            for (int j = i; j >= 1; j--){
//                System.out.print(j + " ");
//            }
//            for (int j = 2; j <= i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }

    static void pat30 (int n){
        for (int i = 1; i <= n; i++){
            int space = n - i;
            for (int j = 1; j <= space; j++){
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--){
                 System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++){
                 System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pat1( int n){
        for (int row = 1; row <= n; row++){
            //for every row, run the col
            for (int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            // when one row is printed we need to print a new line
            System.out.println();
        }
    }

    static void pat2(int n){
        for (int row = 1; row <= n; row++){
            //for every row, run the col
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            // when one row is printed we need to print a new line
            System.out.println();
        }
    }

    static void pat3(int n){
        for (int row = 1; row <= n; row++){
            //for every row, run the col
            for (int col = 1; col <= n - row + 1; col++){
                System.out.print("* ");
            }
            // when one row is printed we need to print a new line
            System.out.println();
        }
    }

    static void pat4(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pat5(int n){
        int totalCol;
        for (int row = 1; row < 2 * n; row++){
            if (row <= n){
                totalCol = row ;
            } else {
                totalCol = 2 * n - row;
            }
            for (int col = 1; col <= totalCol; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pat6(int n){
        int space;
        int totalcol;
        for (int i = 1; i < 2 * n; i++){
            if (i > n){
                space = i - n;
                totalcol = 2 * n - i;
            } else {
                space = n - i;
                totalcol = i;
            }
            for (int j = 0; j < space; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < totalcol; k++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }

}
