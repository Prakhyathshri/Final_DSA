package com.practice08;
//https://leetcode.com/problems/sorting-the-sentence/description/

public class SortingtheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];

        for (int i = 0; i < words.length; i++){
            String temp = words[i];
            int position = temp.charAt(temp.length() - 1) - '0';

            // -0 is been done because temp.length() will give last position
            // But in char value which gives the ascii so when we minus 0 from ascii value we get it

            sorted[position- 1] = temp.substring(0, temp.length() - 1);
        }
        return String.join(" ", sorted);
    }
}
