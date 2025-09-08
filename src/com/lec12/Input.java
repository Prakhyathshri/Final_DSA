package com.lec12;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 34;
        arr[3] = 65;
        arr[4] = 635;
        System.out.println(arr[3]);
        //Repetitive for 1000's will be a pain

        //Input using loops
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter " + i + " number: ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        //This will convert the arrays into string and print it
        //It will add brackets, comma also
        // O U T P U T : [1, 2, 3, 4, 5]
        //Kunal says this is the best one to print

        //to print an array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // O U T P U T : 1 2 3 4 5


        //Enhanced FOR EACH LOOP
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        //Here num represents the element of the array
        //Reference variable

//        System.out.println(arr[6]);
        //This will give an error, we are trying to print elements that doesnt exists
        //Index out of bound error

        //Above was the array of PREMITIVES
        //Below is the arrays of OBJECTS

        String[] str = new String[4];
        for(int i = 0; i < str.length; i++){
            System.out.print("Enter " + i + " String: ");
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        str[1] = "Yuva";
        System.out.println(Arrays.toString(str));



    }
}
