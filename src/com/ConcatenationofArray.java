package com;

import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 1})));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] res = new int[2 * nums.length];

        res[0] = nums[0];

        for (int i = 1; i < res.length; i++) {
            if (i < nums.length) {
                res[i] = nums[i];
            } else {
                res[i] = nums[i - nums.length];
            }
        }

        return res;
    }
}
