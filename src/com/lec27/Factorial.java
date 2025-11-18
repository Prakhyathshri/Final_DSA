package com.lec27;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }

    static int fact(int n){;
        if (n <= 1){           //This will return 1 if n is 0 or 1
            return 1;
        }
        return n * fact(n - 1);
    }
}
