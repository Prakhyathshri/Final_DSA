package com.practice03;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter " + i + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[5];
        int j = arr2.length - 1;
        for(int i = 0; i < arr.length; i++){
            arr2[j] = arr[i];
            j--;
        }
        System.out.println("Reversed String");
        System.out.println(Arrays.toString(arr2));
    }
}
