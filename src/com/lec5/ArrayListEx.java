package com.lec5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //SYNTAX
        ArrayList<Integer> list = new ArrayList<>(10);

        for (int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++){
            //get item at any index
            System.out.println(list.get(i));
            //This has a different syntax that normal arrays printing
        }

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        System.out.println(list);
        //The initial capacity was defined as 10
        //But here there are 11 elements ? How

        System.out.println(list.contains(11)); //true
        //To check if the element is present in the array

        list.set(0,99);
        //0th index will be changed to 99

        list.remove(2);
        //to remove and object at particular index


    }
}
