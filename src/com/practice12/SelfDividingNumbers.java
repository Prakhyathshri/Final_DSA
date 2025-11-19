package com.practice12;
// https://leetcode.com/problems/self-dividing-numbers/

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        int left = 1, right = 22;
        System.out.println(selfDividingNumbers(left, right));
    }

    static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> check = new ArrayList<>();
        for (int i = left; i <= right; i++){
            if (isSelf(i)){
                check.add(i);
            }
        }
        return check;
    }

    static boolean isSelf(int num){
        int copy = num;
        while (num > 0){
            int temp = num % 10;
            if (temp == 0 || copy % temp != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
