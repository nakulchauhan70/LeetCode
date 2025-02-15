package com.patterns.prefixsum;

public class RangeSumQueryImmutable {

    int[] prefix;

    public RangeSumQueryImmutable(int[] nums) {
        this.prefix = new int[nums.length];
        int current = 0;

        for (int i = 0; i < nums.length; i++) {
            current += nums[i];
            prefix[i] = current;
        }
    }

    public int sumRange(int left, int right) {
        int rightSum = prefix[right];
        int leftSum = left == 0 ? 0 : prefix[left - 1];

        return rightSum - leftSum;
    }
}
