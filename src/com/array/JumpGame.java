package com.array;

public class JumpGame {

    //Greedy algorithm
    public static boolean canJump(int[] nums) {
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxIndex) {
                return false;
            }

            maxIndex = Math.max(maxIndex, i + nums[i]);
        }
        return true;
    }

    //1,0,4
    //1,4,0
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{0, 1}));

        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(canJump(new int[]{3, 2, 1, 0, 4}));

    }
}
