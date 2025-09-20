package com.practice05;

//https://leetcode.com/problems/count-items-matching-a-rule/description/
public class CountItemsMatchRule {
    public static void main(String[] args) {
//        String[][] items = {{"phone", "blue", "pixel"},
//                {"computer", "silver", "lenovo"},
//                {"phone", "gold", "iphone"}
//        };
//        String ruleKey = "color", ruleValue = "silver";

        String[][] items = {{"phone","blue","pixel"},
                {"computer","silver","phone"},
                {"phone","gold","iphone"}
        };
        String ruleKey = "type", ruleValue = "phone";
        System.out.println(countMatches(items, ruleKey, ruleValue));

    }

    static int countMatches(String[][] items, String ruleKey, String ruleValue) {
        int temp = 0;
        if (ruleKey.equals("type")) {
            temp = 0;
        } else if (ruleKey.equals("color")) {
            temp = 1;
        } else {
            temp = 2;
        }
        int count = 0;
        for (int i = 0; i < items.length; i++) {
                if (ruleValue.equals(items[i][temp])) {
                    count++;
                }
        }
        return count;
    }
}
