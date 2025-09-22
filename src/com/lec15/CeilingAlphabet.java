package com.lec15;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class CeilingAlphabet {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;

        if (target >= letters[end]) {
            return letters[0];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            //This will not print the mid, it will directly point to the next element
            //Even if the element is equal, and them at the end
            //start > end, it will return the start, that will be the next smallest element
        }

        return letters[start];

        //This is a different approach for wrap around, i have handled it using
        //if statement in the starting itself
//        return letters[start % letters.length];
    }
}