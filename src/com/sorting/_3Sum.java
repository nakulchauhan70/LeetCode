//package com.sorting;
//
//import java.util.*;
//
//public class _3Sum {
//    public static void main(String[] args) {
//        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
//    }
//
//    public static List<List<Integer>> threeSum(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return new ArrayList<>();
//        }
//
//        Set<List<Integer>> thriplets = new HashSet<>();
//
//        //if x + y + z = 0 then y + z = -x is also true
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length - 2; i++) {
//            int first = i + 1;
//            int second = nums.length - 1;
//
//            while (first < second) {
//                int twoNumSum = nums[first] + nums[second];
//                if (twoNumSum == -nums[i]) {
//                    thriplets.add(List.of(nums[i], nums[first], nums[second]));
//                    first++;
//                    second--;
//                } else if (twoNumSum > -nums[i]) {
//                    second--;
//                } else if (twoNumSum < -nums[i]) {
//                    first++;
//                }
//            }
//        }
//
//        return new ArrayList<>(thriplets);
//    }
//}
