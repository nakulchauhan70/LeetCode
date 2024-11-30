package com.string;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int s_pointer = 0, t_pointer = 0;
        while (s_pointer < s.length() && t_pointer < t.length()) {
            char s_ch = s.charAt(s_pointer);
            char t_ch = t.charAt(t_pointer);

            if (s_ch == (t_ch))
                s_pointer++;

            t_pointer++;
        }
        return s_pointer == s.length();
    }
}
