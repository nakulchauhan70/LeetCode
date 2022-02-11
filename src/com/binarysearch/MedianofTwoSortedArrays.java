package com.binarysearch;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;

        int m = nums1.length;
        int n = nums2.length;

        int[] newArr = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                newArr[k] = nums1[i];
                i++;
            } else {
                newArr[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            newArr[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            newArr[k] = nums2[j];
            j++;
            k++;
        }

        int midEle = (m + n) / 2;

        if ((m + n) % 2 != 0) {
            return newArr[(m + n) / 2];
        } else {
            double e1 = newArr[midEle];
            double e2 = newArr[midEle - 1];

            return (e1 + e2) / 2;
        }
    }
}
