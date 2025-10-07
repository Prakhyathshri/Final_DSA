package com.lec21;

public class STringBUilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        //We perform  all the methods available on String builder

        builder.reverse();
        System.out.println(builder.toString());


    }
}
