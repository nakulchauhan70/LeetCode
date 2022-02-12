package com.twopointer;

import java.util.Arrays;

public class _3NumberClosest {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        System.out.println(threeSumClosest(new int[]{0, 0, 0}, 1));

    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        int result = nums[0] + nums[1] + nums[length - 1];
        for (int i = 0; i < length - 2; i++) {
            int first = i + 1;
            int second = length - 1;

            while (first < second) {
                int sum = nums[i] + nums[first] + nums[second];
                if (sum > target) {
                    second--;
                } else {
                    first++;
                }

                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }

        return result;
    }
}
