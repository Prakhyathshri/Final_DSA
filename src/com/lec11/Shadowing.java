package com.lec11;

public class Shadowing {
//        two variable in the same name within the same block which overlaps

    static int x = 90;
    //This will be available inside the whole block
    public static void main(String[] args) {
        System.out.println(x); //90
//        This wil be shadowed by lower level
        int x = 10;
        System.out.println(x); //40;
        fun(); //90
        //This cant be used by all inside the psvm block

    }

    static void fun(){
        System.out.println(x);
    }

}
