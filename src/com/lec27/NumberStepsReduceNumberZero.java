package com.lec27;

public class NumberStepsReduceNumberZero {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(numberOfSteps(num));
    }

    static int numberOfSteps(int num) {
        int count = 0;
        while (num > 0){
            if (num % 2 == 0){
                num = num / 2;
                count++;
            } else {
                num = num - 1;
                count++;
            }
        }
        return count;
    }
}
