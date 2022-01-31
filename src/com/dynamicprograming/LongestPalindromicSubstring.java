package com.dynamicprograming;

//O(n^2) time | O(1) space
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        longestPalindrome("babad");
    }

    public static String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        int len;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i + 1);
            len = Math.max(len1, len2);

            //everytime update start and end of new found palindrome
            if (len > (end - start)) {
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }

        return s.substring(start, end + 1);
    }

    public static int expandFromMiddle(String s, int left, int right) {
        if (s == null || left > right) {
            return 0;
        }

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
