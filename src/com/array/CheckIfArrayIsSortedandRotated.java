package com.array;

public class CheckIfArrayIsSortedandRotated {
    public static boolean check(int[] nums) {
        // if array was sorted then there would be only one possibility where current element is greater than next
        // like for ex. [3,4,5,1,2] => 5>1

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }

//        if (count > 1) {
//            return false;
//        }
//
//        return true;
        return count <= 1;
    }

    public static void main(String[] args) {
        check(new int[]{6, 10, 6});
    }
}
