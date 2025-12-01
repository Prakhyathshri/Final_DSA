package com.practice10;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    static void reverseString(char[] s) {
        int a = 0;
        int e = s.length - 1;
        while (a < e){
            char temp = s[a];
            s[a] = s[e];
            s[e] = temp;
            a++;
            e--;
        }
    }
}
