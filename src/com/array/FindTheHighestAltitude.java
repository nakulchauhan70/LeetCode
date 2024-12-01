package com.array;

public class FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int maxAlt = Math.max(gain[0], 0);
        int currentAlt = gain[0];

        if (gain.length == 1) {
            return maxAlt;
        }

        for (int i = 1; i < gain.length; i++) {
            currentAlt = currentAlt + gain[i];
            maxAlt = Math.max(maxAlt, currentAlt);
        }

        return maxAlt;
    }

    public static void main(String[] args) {
        largestAltitude(new int[]{52, -91, 72});
        largestAltitude(new int[]{-5, 1, 5, 0, -7});
    }
}
