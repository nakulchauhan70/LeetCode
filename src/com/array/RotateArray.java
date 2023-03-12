package com.array;

public class RotateArray {
    public static void main(String[] args) {
        rotate(new int[]{-1, -100, 3, 99}, 2);
    }

    public static void rotate(int[] nums, int k) {
        if (nums.length == 1) {
            return;
        }

        int i = 1;
        int first;

        while (i <= k) {
            first = nums[nums.length - 1];
            for (int j = nums.length - 2; j >= 0; j--) {
                nums[j + 1] = nums[j];
            }
            nums[0] = first;
            i++;
        }

//        System.out.println(Arrays.toString(nums));
    }
    //{-1, -100, 3, 99}
    //[1,2,3,4,5,6,7]
    //[5,6,7,1,2,3,4]
    //temp = 4
}
