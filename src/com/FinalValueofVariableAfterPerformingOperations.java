package com;

import java.util.ArrayList;
import java.util.List;

public class FinalValueofVariableAfterPerformingOperations {
    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
        System.out.println(finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));
        System.out.println(finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"}));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        List<String> increment = new ArrayList<>();
        increment.add("++X");
        increment.add("X++");

        for (String operation : operations) {
            if (increment.contains(operation)) {
                x++;
            } else {
                x--;
            }
        }

        return x;
    }
}
