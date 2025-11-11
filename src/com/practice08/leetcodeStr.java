package com.practice08;

import java.sql.SQLOutput;
import java.util.Arrays;

public class leetcodeStr {
    public static void main(String[] args) {
//        String s = "Hello";
//        System.out.println(toLowerCase(s));

//        String s = "textbook";
//        System.out.println(halvesAreAlike(s));

//        String s = "10#11#12";
//        System.out.println(freqAlphabets(s));

//        String[] patterns = {"a","abc","bc","d"};
//        String word = "abc";
//        System.out.println(numOfStrings(patterns, word));

        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }

//    https://leetcode.com/problems/robot-return-to-origin/description/
    static public boolean judgeCircle(String moves) {
        int[] zero = {0,0};
        int[] copy = {0,0};
        for (int i = 0; i < moves.length(); i++){
            char c = moves.charAt(i);
            if (c == 'U'){
                zero[1]++;
            } else if (c == 'D'){
                zero[1]--;
            } else if (c == 'R'){
                zero[0]++;
            } else {
                zero[0]--;
            }
        }
        return Arrays.equals(zero, copy);
    }

//    https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/description/
    static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (int i = 0; i < patterns.length; i++){
            if (word.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }

// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
    static String freqAlphabets(String s) {
        StringBuilder x = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            int num;
            if (s.charAt(i) == '#') {
                num = Integer.parseInt(s.substring(i - 2, i));
                i -= 2;
            } else {
                num = s.charAt(i) - '0';
            }
            x.append((char) (num + 96));
        }
        return x.reverse().toString();
    }

// https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
    static boolean halvesAreAlike(String s) {
        String x = s.toLowerCase();
        String a = x.substring(0, x.length()/ 2);
        String b = x.substring(x.length()/2, x.length());
        System.out.println(a);
        System.out.println(b);

        int temp1 = 0;
        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u'){
                temp1++;
            }
        }
        int temp2 = 0;
        for (int i = 0; i < b.length(); i++){
            if (b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o' || b.charAt(i) == 'u'){
                temp2++;
            }
        }
        return (temp1 == temp2);
    }

// https://leetcode.com/problems/to-lower-case/description/
    static String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
