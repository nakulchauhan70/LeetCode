package com.twopointer;

import java.util.Arrays;
import java.util.List;

public class MaximumNumberofVowelsinaSubstringofGivenLength {
    public int maxVowels(String s, int k) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        if (s.length() == 1 && vowels.contains(s.charAt(0))) {
            return 1;
        }

        int maxVowels = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }

        maxVowels = Math.max(count, maxVowels);

        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }

            //actually changing window here, validating k steps before char
            if (vowels.contains(s.charAt(i - k))) {
                count--;
            }

            maxVowels = Math.max(count, maxVowels);
        }

        return maxVowels;
    }
}
