//package com.practice07;
//
//public class AssignCoockies {
//    public static void main(String[] args) {
//        int[] g = {1,2,3}, s = {1,1};
//        System.out.println(findContentChildren(g, s));
//    }
//
//    static int findContentChildren(int[] g, int[] s) {
//        int check = 0;
//        for (int i = 0; i < g.length; i++) {
//            int temp = check;
//            while (temp <= s.length - 1){
//                if (g[i] <= s[temp]){
//                    check++;
//                    break;
//                }
//                temp++;
//            }
//        }
//        return check;
//    }
//}
