package com.practice08;
//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

public class ReverseWordsStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String x) {
        String[] s = x.split(" ");
        String f = "";
        for (int i = 0; i < s.length; i++){
            for (int j = s[i].length() - 1; j >= 0; j--){
                char temp = s[i].charAt(j);
                f = f + temp;
            }
            if (i != s.length - 1){
                f = f + " ";
            }
        }
        return f;
    }
}
