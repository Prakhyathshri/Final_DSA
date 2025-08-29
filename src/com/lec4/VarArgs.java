package com.lec4;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //VarArgs - When we dont know how many arguments we are giving
        fun(2, 3, 4, 5, 6, 7, 8, 9);
        //This will be stored in arrays

        multiple(2,3,"yuva","Prakhyath");
        //The order should be same as how its declared
        //The var_args should be at last, bcz it would'nt get to know when it would end
        //The strings will be stored as arrays - as the third element

    }
//  static void fnx_declaration(data_type var_name){
    //body
//   }

    static void multiple(int a, int b, String ...v){
        System.out.printf("%d %d", a , b);
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...variable_name) {
        System.out.println(Arrays.toString(variable_name));
    }
}
