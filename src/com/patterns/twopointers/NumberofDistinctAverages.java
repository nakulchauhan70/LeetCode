package com.patterns.twopointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberofDistinctAverages {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        Set<Double> set = new HashSet<>();

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            double avg = (double) (nums[left] + nums[right]) / (double) 2;
            set.add(avg);

            left++;
            right--;
        }

        return set.size();
    }
}
