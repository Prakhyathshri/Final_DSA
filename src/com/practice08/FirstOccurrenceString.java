package com.practice08;
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

public class FirstOccurrenceString {
    public static void main(String[] args) {
        String haystack = "leetcode", needle = "ee";
        System.out.println(strStr(haystack, needle));
    }

    static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()){
            return -1;
        }
        for (int i = 0; i <= haystack.length() - (needle.length()); i++){
            if (needle.charAt(0) == haystack.charAt(i)){
                String sub = haystack.substring(i, i + (needle.length()));
                if (sub.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
