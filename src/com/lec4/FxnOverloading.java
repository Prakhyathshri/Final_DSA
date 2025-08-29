package com.lec4;

import java.util.Arrays;

public class FxnOverloading {
    public static void main(String[] args) {
        fun(30);
        fun("yuva");
        System.out.println(fun(1,2,3));
        System.out.println(fun(1,2));
        demo(1,2,3,4,5);
        demo("hi","Helloo");
        //demo(); //This will be error in this case- it cant be empty when overloading var_args
    }
//it will be decided automatically at the compile time

    //To or more fnx with same name can exist if the parameters are different
    //or different arguments
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static int fun(int a, int b){
        return a + b;
    }

    static int fun(int a, int b, int c){
        return a + b + c;
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}

