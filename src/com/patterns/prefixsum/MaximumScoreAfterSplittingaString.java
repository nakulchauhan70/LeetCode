package com.patterns.prefixsum;

public class MaximumScoreAfterSplittingaString {
    public static int maxScore(String s) {
        int[] zeroArr = new int[s.length()];
        int[] oneArr = new int[s.length()];

        int zeroCount = 0;
        int oneCount = 0;

        int max = 0;

        for (int i = 0; i < s.toCharArray().length; i++) {
            if (s.charAt(i) == '0') {
                zeroCount++;
            }
            zeroArr[i] = zeroCount;
        }

        for (int i = s.toCharArray().length - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                oneCount++;
            }
            oneArr[i] = oneCount;
        }

        int first = 0;
        int second = 1;

        while (second < s.length()) {
            int len = zeroArr[first] + oneArr[second];
            if (len > max) {
                max = len;
            }
            first++;
            second++;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
    }
}
