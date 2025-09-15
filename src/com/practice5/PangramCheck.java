package com.practice5;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
public class PangramCheck {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));

    }

    static boolean checkIfPangram(String sentence) {
        boolean isPan = false;
        if (sentence.length() < 26){
            return isPan;
        } else {
            int count = 0;
            for (int j = 0; j < sentence.length(); j++) {
                for (int i = 97; i <= 122; i++) {
                    if (sentence.charAt(j) == i) {
                        count++;
                    } else {
                        return isPan;
                    }
                }
            }
            if (count == 26){
                isPan = true;
            }
        }
        return isPan;
    }
}
