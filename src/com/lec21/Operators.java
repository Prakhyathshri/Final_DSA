package com.lec21;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        //It will add the char to ASCII value
        System.out.println("a" + "b");
        //It will CONCAT the strings now

        System.out.println((char)('a' + 3));
        System.out.println("a" + 3);
        //This will call toString and print it

        System.out.println("yuva" + new ArrayList<>());
        //This will just return everything as it is

//      System.out.println("Yuva" + new Integer(50));
//      Outdated version


    }
}
