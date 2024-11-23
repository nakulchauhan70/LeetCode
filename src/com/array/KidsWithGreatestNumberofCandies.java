package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatestNumberofCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();

        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if ((candy + extraCandies) >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
