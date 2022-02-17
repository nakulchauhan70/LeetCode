package com.prefixsum;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int start = 0;

        int minSize = Integer.MAX_VALUE;
        int sum = 0;


        for (int end = 0; end < nums.length; end++) { //this loop increases the window size
            sum += nums[end];

            while (sum >= target) {
                minSize = Math.min(minSize, end + 1 - start);
                sum -= nums[start];             // make window size small from start
                start++;
            }

        }

        return minSize != Integer.MAX_VALUE ? minSize : 0;
    }
}

//https://www.youtube.com/watch?v=3OiwU4EHjSM
