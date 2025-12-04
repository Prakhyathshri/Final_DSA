package com.lec32;

public class RecursionRemoveA {
    public static void main(String[] args) {
        String str = "baccad";
        removeA("", str);

        System.out.println(removeAR("", str));

        System.out.println(removeA2R(str));

        System.out.println(skipApple("aapplefg"));

        System.out.println(skipApp("appapplefg"));

    }

    // This will keep the APP which is inside apple, and remove app in other places
    static String skipApp(String up){
        if (up.isEmpty()){
            return "";
        }

        if (!up.startsWith("apple") && up.startsWith("app")){
            return skipApp(up.substring(3));
        } else {
            return up.charAt(0) + skipApp(up.substring(1));
        }
    }

    static String skipApple(String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("apple")){
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String removeA2R(String up){
        if (up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if (ch == 'a'){
            return removeA2R(up.substring(1));
        } else {
            return ch + removeA2R(up.substring(1));
        }
    }

    static String removeAR(String p, String up){
        if (up.isEmpty()){
            return p;
        }

        char ch = up.charAt(0);
        if (ch == 'a'){
            return removeAR(p, up.substring(1));
        } else {
            return removeAR(p + ch, up.substring(1));
        }
    }

    static void removeA(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a'){
            removeA(p, up.substring(1));
        } else {
            removeA(p + ch, up.substring(1));
        }
    }
}
