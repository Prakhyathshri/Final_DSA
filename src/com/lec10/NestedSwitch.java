package com.lec10;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID Number: ");
        int empID = sc.nextInt();
        System.out.print("Enter Department: ");
        String department = sc.next();

        switch (empID) {
            case 1 -> {
                System.out.println("Yuva");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    case "Core" -> System.out.println("Core department");
                    default -> System.out.println("Invalid entry of Department");
                }
            }
            case 2 -> {
                System.out.println("Prakh");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    case "Core" -> System.out.println("Core department");
                    default -> System.out.println("Invalid entry of Department");
                }
            }
            case 3 -> {
                System.out.println("Shri");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    case "Core" -> System.out.println("Core department");
                    default -> System.out.println("Invalid entry of Department");
                }
            }
            default -> System.out.println("Invalid ID number");
        }
    }
}
