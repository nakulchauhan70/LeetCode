package com.array;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int r = m + n - 1;
        m = m - 1;
        n = n - 1;

        while (n > -1) {
            if (nums1[m] > nums2[n]) {
                nums1[r] = nums1[m];
                m--;
            } else {
                nums1[r] = nums2[n];
                n--;
            }
            r--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        merge(nums1, 3, nums2, 3);
    }
}
