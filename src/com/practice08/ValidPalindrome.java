package com.practice08;
// https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        String b = a.replaceAll("[^a-z0-9]","");
        int start = 0, end = b.length() - 1;
        while (start < end){
            if (b.charAt(start) == b.charAt(end)){
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
