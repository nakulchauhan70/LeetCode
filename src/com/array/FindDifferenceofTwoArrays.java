package com.array;

import java.util.*;
import java.util.stream.Collectors;

public class FindDifferenceofTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> nums1List = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> nums2List = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        Set<Integer> res1Set = new HashSet<>();
        Set<Integer> res2Set = new HashSet<>();

        List<List<Integer>> resList = new ArrayList<>();

        for (int num : nums1) {
            if (!nums2List.contains(num)) {
                res1Set.add(num);
            }
        }

        for (int num : nums2) {
            if (!nums1List.contains(num)) {
                res2Set.add(num);
            }
        }

        resList.add(new ArrayList<>(res1Set));
        resList.add(new ArrayList<>(res2Set));

        return resList;
    }

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
        System.out.println(findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}));
    }
}
