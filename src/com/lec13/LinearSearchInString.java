package com.lec13;

import java.util.Arrays;

public class LinearSearchInString {
    public static void main(String[] args) {
        String name = "prakhyath";
        char target = 'y';
        System.out.println(search(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search2(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()){
            //str.toCharArray() converts the string into an array of characters
            //['p','r','a','k','h','y','a','t','h']
            if (ch == target){
                return true;
            }
        }
        return false;
    }


    static boolean search(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
