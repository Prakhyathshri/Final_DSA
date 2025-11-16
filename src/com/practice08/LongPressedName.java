package com.practice08;
// https://leetcode.com/problems/long-pressed-name/

public class LongPressedName {
    public static void main(String[] args) {
//        String name = "alex", typed = "aaleex";
        String name = "a", typed = "b";
        System.out.println(isLongPressedName(name, typed));
    }

    static boolean isLongPressedName(String name, String typed) {
        if (typed.length() < name.length()){
            return false;
        }
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }
}
