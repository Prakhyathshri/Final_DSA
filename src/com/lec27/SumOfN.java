package com.lec27;

public class SumOfN {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }

    static int sum(int n){
        if (n <= 1){           //This will return 1 if n is 0 or 1
            return 1;
        }
        return n + sum(n - 1);
    }


}
