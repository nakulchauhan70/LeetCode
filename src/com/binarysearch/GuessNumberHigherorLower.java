package com.binarysearch;

public class GuessNumberHigherorLower {
    static int pick = 10;

    public static void main(String[] args) {
    }

    private static int guessNumber(int n) {
        long start = 0;
        long end = n;
        long mid = -1;
        long res;
        while (start <= end) {
            mid = (start + end) / 2;
            res = guess((int) mid);
            if (res == 0) {
                break;
            } else if (res == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (int) mid;
    }


    private static int guess(int num) {
        if (num > pick) {
            return -1;
        } else if (num < pick) {
            return 1;
        } else {
            return 0;
        }
    }
}
