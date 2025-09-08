package com.lec12;

public class Main {
    public static void main(String[] args) {

        //Q:Store a ROll number
        int a = 10;

        //Q:Store a name
        String name = "yuva";

        //Q:Store 5 roll numbers
        int aa = 10;
        int aaa = 10;
        int aaaa = 10;
        int aaaaa = 10;
        int aaaaaa = 10;
        //Now imagine doing it for 500 roll numbers
        //Thats where arrays come in

        //ARRAYS is an COLLECTION Od DATA TYPES
        //SYNTAX
        //datatype[] var_name = new datatype[size];
        int[] roll = new int[5];

        int col[] = new int[3];
        //This is the c++ way of doing it
        //But above is the best way to do #CLEAN CODE


        //or
        int [] roll2 = {22,33,44,55,66};

        int[] ros; //Here is the array is being defined
        ros = new int[5]; //Here the actual memory allocation is happening
        System.out.println(ros[0]); //This will print 0
        //All the empty int arrays will have 0 by default
        // STRING will have NULL in it
    }
}
