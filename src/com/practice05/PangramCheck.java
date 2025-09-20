package com.practice05;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
public class PangramCheck {
    public static void main(String[] args) {
        String sentence = "leetcodeabcdefghijklmnopqrstuvwxyz";
        System.out.println(checkIfPangram(sentence));

    }

    static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26){
            return false;
        } else {
            boolean[] check = new boolean[26];
            for (int i = 0; i < sentence.length(); i++){
                char c = sentence.charAt(i);
                    if (c >= 'a' && c <= 'z'){
                        check[c - 'a'] = true;
                    }

            }
            for (int i = 0; i < check.length; i++){
                if (!check[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
