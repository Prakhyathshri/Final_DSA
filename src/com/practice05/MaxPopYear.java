package com.practice05;
//https://leetcode.com/problems/maximum-population-year/description/

import java.util.ArrayList;

public class MaxPopYear {
    public static void main(String[] args) {
        int[][] logs = {{1993,1999},{2000,2010}};
//        Output: 1993
        maximumPopulation(logs);
    }

    static int maximumPopulation(int[][] logs) {
        ArrayList<Integer> year = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < logs.length; i++){
            for (int j = 0; j < logs[i].length; j++){
                int temp = 0;
                for (int a = 0; a < logs.length; a++){
                    for (int b = 0; b < logs[a].length; b++){
                        if (j == 0){
                            if (logs[i][j] <= logs[a][b]){
                                temp++;
                            }
                        } else {
                            if (logs[i][j] - 1 <= logs[a][b] - 1){
                                temp++;
                            }
                        }
                        if (j == 0){
                            year.add(logs[i][j]);
                            count.add(temp);
                        } else {
                            year.add(logs[i][j] - 1);
                            count.add(temp);
                        }
                    }
                }
            }
        }
        System.out.println(year);
        System.out.println(count);
        return -1;
    }

}
