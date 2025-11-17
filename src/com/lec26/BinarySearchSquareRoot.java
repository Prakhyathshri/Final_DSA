package com.lec26;

public class BinarySearchSquareRoot{
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
//        System.out.println(findSRoot(n));
        System.out.println(sqrt(n, p));
        System.out.printf("%.3f", sqrt(n, p));
    }

    // Time - O(log(N))
    // for not perfect square
    static double sqrt(int n, int p){
        int s = 0, e = n;

        double root = 0.0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m == n){
                return m;
            }
            if (m * m > n){
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n){
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }

        return root;
    }
    /*
This function finds the square root of a number up to p decimal places.
Binary Search (integer part):
It first tries to find the square root using binary search.
If n is a perfect square, it returns that exact number.
If not, it just finishes the search (no return).
Decimal Precision Loop:
Starting from root = 0, it increases the value in small steps:
First by 0.1
Then by 0.01
Then by 0.001
… up to p decimal places.
In each stage, it keeps adding the increment until root * root becomes greater than n,
then steps back and reduces the increment for the next decimal place.
     */
}