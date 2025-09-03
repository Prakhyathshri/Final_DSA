package com.lec6;

public class LinearSearchStrings {
    public static void main(String[] args) {
        String[] arr = {"AA","BB","CC","DD","EE"};
        String target = "AAA" ;
        boolean found = linearSearch(arr, target);
        System.out.println(found);
    }

    static boolean linearSearch(String[] arr, String target) {
        if (arr.length == 0){
            return false;
        }
        for(String element : arr){
            if (element == target){
                return true;
            }
        }
        return false;
    }
}
