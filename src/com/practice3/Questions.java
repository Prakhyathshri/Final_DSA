package com.practice3;

import java.util.Scanner;

public class Questions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }



    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        //c - is a count variable like i
        //c <= sqrt(n):  squaring on Both sides = (c * c <= n)
        //For keeping calculation simple
        int c = 2;
        while(c * c <= n){
            if (n % c == 0){
                return false;
//WE DONT HAVE TO USE BREAK BCZ BASICALLY RETURN MEANS PROPGRAM OVER
            }
            c++;
        }
        return c * c > n;
        //Bcz if any of the number didnt return 0 then it will be given true after all the conditions are checked
        //Could return true directly also

    }
}
