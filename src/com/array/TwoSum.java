package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int rem;

        for (int i = 0; i < nums.length; i++) {
            rem = target - nums[i];
            if (map.values().contains(rem)) {
                return new int[]{getKey(map, rem), i};
            } else {
                map.put(i, nums[i]);
            }
        }

        return new int[]{-1, -1};
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            map.put(target - nums[i], i);
        }

            for (int i = 0; i < size; i++) {
            if (map.containsKey(nums[i])) {
                if (i != map.get(nums[i]))
                    return new int[]{i, map.get(nums[i])};
            }
        }
        return new int[]{};
    }

    private static Integer getKey(Map<Integer, Integer> map, int value) {
        return map.entrySet().stream().filter(entry -> value == entry.getValue()).map(Map.Entry::getKey).findFirst().orElse(0);
    }
}
