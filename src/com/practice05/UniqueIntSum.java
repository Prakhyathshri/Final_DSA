package com.practice05;
//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/
import java.util.Arrays;

public class UniqueIntSum {
    public static void main(String[] args) {
        int n = 3;
//        Output: [-7,-1,1,3,4]
//        Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
        System.out.println(Arrays.toString(sumZero(n)));
    }

    static int[] sumZero(int n) {
        if (n == 1){
            return new int[]{0};
        }
        int[] ans = new int[n];
        for (int i = 1; i < n; i++){
            ans[i] = i;
        }
        int sum = 0;
        for (int i = 1; i < n; i++){
            sum = sum + ans[i];
        }
        ans[0] = -sum;
        return ans;
    }
}
