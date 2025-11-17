package com.practice08;
// https://leetcode.com/problems/length-of-last-word/

public class LengthofLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    static int lengthOfLastWord(String s) {

        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) == ' ' && count >= 1){
                return count;
            }
            if (s.charAt(i) != ' '){
                count++;
            }
        }
        return count;
    }
}
