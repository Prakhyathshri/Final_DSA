package com.practice08;
// https://leetcode.com/problems/goal-parser-interpretation/description/

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }

    static String interpret(String command) {
        String ans = command.replace("()","o");
        ans = ans.replace("(al)","al");
        return ans;
    }
}
