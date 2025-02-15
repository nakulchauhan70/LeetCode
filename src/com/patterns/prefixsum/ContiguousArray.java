package com.patterns.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    //0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        int sum = 0;

        Map<Integer, Integer> map = new HashMap<>(); //Map<Sum, Index>
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum += (-1);
            } else {
                sum += 1;
            }

            if (map.containsKey(sum)) {
                int index = map.get(sum);
                int len = i - index;

                if (len > maxLength) {
                    maxLength = len;
                }
            } else {
                map.put(sum, i);
            }

        }

        return maxLength;
    }
}
