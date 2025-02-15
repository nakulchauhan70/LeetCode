package com.patterns.twopointers;

import java.util.*;

public class _3Sum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<Long> set = new HashSet<>();
        List<List<Integer>> thriplets = new ArrayList<>();

        Arrays.sort(nums);

        int target = 0;

        for (int i = 0; i < nums.length; i++) {
            int nTarget = target - nums[i];

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int twoNumSum = nums[left] + nums[right];

                if (twoNumSum < nTarget) {
                    left++;
                } else if (twoNumSum > nTarget) {
                    right--;
                } else {
                    long hash = getHash(nums[i], nums[left], nums[right]);
                    if (!set.contains(hash)) {
                        thriplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        set.add(hash);
                    }
                    left++;
                    right--;
                }
            }
        }

        return thriplets;
    }

    private static long getHash(int x, int y, int z) {
        long hash = x;

        hash *= 100000;
        hash += y;
        hash *= 100000;
        hash += z;

        return hash;
    }
}
