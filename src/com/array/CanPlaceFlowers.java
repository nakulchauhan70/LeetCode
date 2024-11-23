package com.array;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int i = 0;
        while (i < len && n > 0) {
            if (flowerbed[i] == 1) i += 2;
            else if (i == len - 1 || flowerbed[i + 1] == 0) {
                n--;
                i += 2;
            } else i += 3;
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1);
        //1,0,0,0,1
    }
}
