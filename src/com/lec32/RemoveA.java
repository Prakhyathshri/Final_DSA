package com.lec32;

public class RemoveA {
    public static void main(String[] args) {
        String str = "baccad";
        System.out.println(removeA(str));
    }

    static String removeA(String str){
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a'){
                ans = ans + str.charAt(i);
            }
        }
        return ans;
    }
}
