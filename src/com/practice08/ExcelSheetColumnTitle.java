//package com.practice08;
//
//public class ExcelSheetColumnTitle {
//    public static void main(String[] args) {
//        int columnNumber = 701;
//        System.out.println(convertToTitle(columnNumber));
//    }
//
//    static String convertToTitle(int columnNumber){
//        StringBuilder f = new StringBuilder();
//
//        while (columnNumber > 0){
//            columnNumber--;
//            int rem = columnNumber % 26;
//            char c = (char)(rem + 64);
//            f.append(c);
//            columnNumber /= 26;
//        }
//    }
//
////    static String convertToTitle(int columnNumber) {
////        String f = "";
////        if (columnNumber <= 26){
////            char ans = (char)(columnNumber + 64);
////            f = f + ans;
////            return f;
////        }
////        for (int i = 26; i >= 1; i--){
////            int num = columnNumber - i;
////            if (num % 26 == 0){
////                int x = num / 26;
////                char ans1 = (char)(x + 64);
////                char ans2 = (char)(i + 64);
////                f = f + ans1;
////                f = f + ans2;
////                return f;
////            }
////        }
////        return f;
////    }
//}
