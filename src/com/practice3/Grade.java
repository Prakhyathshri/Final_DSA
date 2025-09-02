package com.practice3;

import java.util.Arrays;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of subjects: ");
        int sub = sc.nextInt();
        System.out.println("Total marks of each subject is 100");
        int each = 100;
        int total = sub * each;
        int[] subjects = new int[sub];
        for (int i = 0; i < subjects.length; i++){
            System.out.print("Enter subject " + (i + 1) + " marks: " );
            subjects[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(subjects));

        //Checking grade for each subject
        for(int i = 0; i < subjects.length; i++){
            System.out.println("Subject " + (i + 1) + " grade: " + gradecheck(subjects[i]));
        }

        int sum = 0;
        for (int i = 0; i < subjects.length; i++){
            sum = sum + subjects[i];
        }
        System.out.println("Your total marks out of " + total + " is " + sum);

        double per = ((double) sum /total) * 100;
        System.out.printf("Your Percentage is %.2f", per);
        System.out.println();

        System.out.println("Your Final grade is " + gradecheck((int)per));

    }

    static String gradecheck(int marks){
        if (marks > 100 || marks < 0){
            return "Invalid Input";
        } else {
            switch (marks / 10) {
                case 10:
                case 9:
                    return "A";
                case 8:
                case 7:
                    return "B";
                case 6:
                case 5:
                    return "C";
                case 4:
                    return "D";
                default:
                    return "F";
            }
        }
    }
}
