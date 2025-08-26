package com.lec4;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
        sum();
        sum();
        sum();
        //I can calling the fucntion how much
        // ever times i need to repeat any work
    }

    //return the value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        //Return usually means, the function ENDS here
        return sum;
        //Here im not printing the sum, I will return this
//        System.out.printf("The sum is %d",sum);
//        System.out.println(sum);
        //The above thing will give an error
    }

    static void sum() {
            Scanner sc = new Scanner(System.in);
            int num1, num2, sum;
            System.out.println("Enter first number: ");
            num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            num2 = sc.nextInt();
            sum = num1 + num2;
            System.out.printf("The sum is %d",sum);

    }

        /*
         access_modifier return_type name () {
            //body
            return statement;
         }
         */
}

