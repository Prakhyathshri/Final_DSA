package com.practice08;
//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/

public class CheckIfTwoStringArraysareEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "";
        String b = "";
        for (int i = 0; i < word1.length; i++){
            a = a + word1[i];
        }
        for (int i = 0; i < word2.length; i++){
            b = b + word2[i];
        }
        if(a.equals(b)){
            return true;
        } else {
            return false;
        }
    }
}
