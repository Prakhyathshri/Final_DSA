package com.practice08;
// https://leetcode.com/problems/merge-strings-alternately/description/

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }

    static String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < word1.length() || i < word2.length(); i++){
            if (i < word1.length()){
                ans.append(word1.charAt(i));
            }
            if (i < word2.length()){
                ans.append(word2.charAt(i));
            }
        }
        String str = ans.toString();;
        return str;
    }
}
