//package com.lec32;
//
//import java.util.ArrayList;
//
//public class SubSeq {
//    public static void main(String[] args) {
//        subSeq("", "abc");
//    }
//
//    static ArrayList<String> subSeq(String p, String up){
//        if (up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//
//        char ch = up.charAt(0);
//        subSeq(p + ch, up.substring(1));
//        subSeq(p, up.substring(1));
//    }
//
//    static void subSeq(String p, String up){
//        if (up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//
//        char ch = up.charAt(0);
//        subSeq(p + ch, up.substring(1));
//        subSeq(p, up.substring(1));
//    }
//}
