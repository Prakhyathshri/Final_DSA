package com.practice02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Program to calculate Area of shapes

        areaOfCircle();
        areaOfTriangle();
        areaOfRectangle();
        areaOfIsoscelesTriangle();
        areaOfParallelogram();
        areaOfRhombus();
        areaOfEquilateralTriangle();
    }

    static void areaOfCircle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of cicrle: ");
        float radius = sc.nextFloat();
        double area = 3.14 * radius * radius;
        System.out.println("Area is " + area);
    }
    static void areaOfTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of triangle: ");
        int height = sc.nextInt();
        System.out.println("Enter the base of triangle: ");
        int base = sc.nextInt();
        double area = 0.5 * base * height;
        System.out.println("Area is " + area);
    }
    static void areaOfRectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the width of rectangle: ");
        int width = sc.nextInt();
        int area = length * width;
        System.out.println("Area is " + area);
    }
    static void areaOfIsoscelesTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of triangle: ");
        int height = sc.nextInt();
        System.out.println("Enter the base of triangle: ");
        int base = sc.nextInt();
        double area = 0.5 * base * height;
        System.out.println("Area is " + area);
    }
    static void areaOfParallelogram(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        int base = sc.nextInt();
        System.out.println("Enter the width of rectangle: ");
        int height = sc.nextInt();
        int area = base * height;
        System.out.println("Area is " + area);
    }
    static void areaOfRhombus(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        int base = sc.nextInt();
        System.out.println("Enter the width of rectangle: ");
        int height = sc.nextInt();
        int area = base * height;
        System.out.println("Area is " + area);
    }
    static void areaOfEquilateralTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the triangle: ");
        int length = sc.nextInt();
        double area = 0.433 * length * length;
        System.out.println("Area is " + area);
    }
}

