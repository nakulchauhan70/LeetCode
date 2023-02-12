package com.binarysearch;

// O(log n) Time
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{-1, 0, 3, 7, 9, 12}, 5));

        System.out.println(binarySearch(new int[]{-1, 0, 3, 5, 9, 12}, 2));
        System.out.println(binarySearch(new int[]{-1, 0, 3, 5, 9, 12}, 9));

    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        //recursive
//        return binarySearchRec(nums, left, right, target);

        //iterative
        return binarySearchIte(nums, left, right, target);
    }

    public static int binarySearchRec(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }

        return binarySearchRec(nums, left, right, target);
    }

    public static int binarySearchIte(int[] nums, int left, int right, int target) {
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
