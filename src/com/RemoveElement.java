package com;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
    }

    //0,1,2,2,3,0,4,2
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int indexToFill = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[indexToFill] = nums[i];
                indexToFill++;
                count++;
            }
        }

//        System.out.println(Arrays.toString(nums));

        return count;
    }
}
