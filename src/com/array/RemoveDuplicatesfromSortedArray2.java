package com.array;

public class RemoveDuplicatesfromSortedArray2 {
    public static void main(String[] args) {
//        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }

        int j = 2;
        for (int i = 2; i < n; i++) {
            if(nums[i] != nums[j-2]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}