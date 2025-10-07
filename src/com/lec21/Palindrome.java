package com.lec21;

public class Palindrome {
    public static void main(String[] args) {
        String check = "";
        System.out.println(isPalindrome(check));
    }

    static boolean isPalindrome(String check){
        check = check.toLowerCase();
        int start = 0;
        int end = check.length() - 1;
        while (start < end){
            if (check.charAt(start) == check.charAt(end)){
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
