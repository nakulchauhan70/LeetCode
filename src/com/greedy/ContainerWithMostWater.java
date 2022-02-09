package com.greedy;

//O(n) time | O(1) space
public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 1}));
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;

        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int lh = height[left];
            int rh = height[right];

            int minHeight = Math.min(lh, rh);
            int length = right - left;
            int currArea = minHeight * length;
            maxArea = Math.max(maxArea, currArea);

            if (lh < rh) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
