package com.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {
        String leftParanthesis = "([{";
        String rightParanthesis = ")]}";

        Map<Character, Character> parenthesisMap = new HashMap<>();
        parenthesisMap.put(')', '(');
        parenthesisMap.put(']', '[');
        parenthesisMap.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (leftParanthesis.indexOf(ch) >= 0) {
                stack.push(ch);
            } else if (rightParanthesis.indexOf(ch) >= 0) {
                if (!stack.isEmpty() && parenthesisMap.get(ch).equals(stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.size() == 0;
    }
}
