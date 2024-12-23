package com.array;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int[] leftMinArray = new int[nums.length];
        int[] rightMaxArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            leftMinArray[i] = min;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            max = Math.max(max, nums[i]);
            rightMaxArray[i] = max;
        }

        for (int i = 0; i < nums.length; i++) {
            if ((leftMinArray[i] < nums[i]) && (nums[i] < rightMaxArray[i])) {
                return true;
            }
        }

        return false;
    }
}
