package com.array;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 1;
        }

        int count = 1;
        int temp = nums[0];
        int nextIndexToFill = 1;
//0,0,1,1,2,2
        for (int i = 1; i < nums.length; i++) {
            if (temp != nums[i]) {
                temp = nums[i];
                nums[nextIndexToFill] = nums[i];
                count++;
                nextIndexToFill++;
            }
        }
        return count;
    }

    public static int removeDuplicates2(int[] nums) {
        if (nums.length == 0) {
            return 1;
        }

        int count = 1;
        int temp = nums[0];
        int nextIndexToFill = 1;
//0,0,1,1,2,2
        for (int i = 1; i < nums.length; i++) {
            if (temp != nums[i]) {
                temp = nums[i];
                nums[nextIndexToFill] = nums[i];
                count++;
                nextIndexToFill++;
            }
        }
        return count;
    }
}
