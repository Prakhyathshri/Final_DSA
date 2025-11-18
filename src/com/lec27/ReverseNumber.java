package com.lec27;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1824;
        System.out.println(revNum(n));
    }
    static int num = 0;     // Initializing the variable outside function will be covered later
    static int revNum(int n){
        if (n == 0){
            return num;
        }
        num = num * 10 + (n % 10);
        return revNum(n/10);

        // This is not a standard way, as it uses global variable
    }
}
