package com.twopointer;

public class MoveZeros {

    public static void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }

    public static void moveZeroes1(int[] nums) {
        int length = nums.length;
        if ((length == 1)) {
            return;
        }

        int left = 0;
        int right = 1;

        while (right < length) {
            if (nums[left] == 0 && nums[right] != 0) { //[0,1]
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right++;
            } else if (nums[left] == 0 && nums[right] == 0) { //[0,0,1]
                right++;
            } else { //[1,2,3,0]
                left++;
                right++;
            }
        }
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{4, 2, 4, 0, 0, 3, 0, 5, 1, 0});
//        moveZeroes(new int[]{0, 1, 0, 3, 12});
//        moveZeroes(new int[]{2, 1});
    }
}
