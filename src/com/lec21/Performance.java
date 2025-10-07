package com.lec21;

public class Performance {
    public static void main(String[] args) {
        //This will print all the char from a to z
        String series = "";
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            System.out.print(ch + " ");
            series += ch;
            // New object is being created everytime
            // It will copy the old string add the new element
            // And then add print
            // Too much memory wastage is happening
        }
        System.out.println();
        System.out.println(series);

        System.out.println("A" + 'A');
        // If one of the datatype is String
        // obv the other will be converted to String only
        //String will not get converted to other

    }
}
