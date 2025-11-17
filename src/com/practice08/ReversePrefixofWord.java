package com.practice08;

public class ReversePrefixofWord {
    public static void main(String[] args) {
        String word = "rzwuktxcjfpamlonbgyieqdvhs";
        char ch = 's';
        System.out.println(reversePrefix(word, ch));
    }

    static String reversePrefix(String word, char ch) {
        int count = findWord(word, ch);
        if (count != 0){
            int copy = count;
            String ans = "";
            for (int i = 0; i <= copy; i++){
                ans = ans + word.charAt(count);
                count--;
            }
            for (int i = copy + 1; i < word.length(); i++){
                ans = ans + word.charAt(i);
            }
            return ans;
        }
        return word;

    }

    static int findWord(String word, char ch){
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == ch){
                return count;
            }
            count++;
        }
        return 0;

    }
}
