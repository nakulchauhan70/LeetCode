package com.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsofaPhoneNumber {
    public static void main(String[] args) {
        letterCombinations("23");
    }

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        Map<Character, String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");


        backtrack(digits, 0, map, new StringBuilder(), ans);

        return ans;
    }

    private static void backtrack(String digits, int i, Map<Character, String> map, StringBuilder sb, List<String> ans) {
        if (i == digits.length()) {
            ans.add(sb.toString());
            return;
        }

        String curr = map.get(digits.charAt(i));

        for (int j = 0; j < curr.length(); j++) {
            sb.append(curr.charAt(j));
            backtrack(digits, i + 1, map, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
