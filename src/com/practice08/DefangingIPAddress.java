package com.practice08;
//https://leetcode.com/problems/defanging-an-ip-address/description/

public class DefangingIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
//        Output: "1[.]1[.]1[.]1"
        System.out.println(defangIPaddr(address));

    }

    static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
