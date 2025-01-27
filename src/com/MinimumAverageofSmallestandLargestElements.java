package com;

import java.util.Arrays;

public class MinimumAverageofSmallestandLargestElements {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        double min = Double.MAX_VALUE;
        double avg;
        int n = nums.length;

        for (int i = 0; i < n / 2; i++) {
            avg = ((double)(nums[i] + nums[n - 1 - i])) / 2;

            if (avg < min) {
                min = avg;
            }
        }

        return min;
    }
}
