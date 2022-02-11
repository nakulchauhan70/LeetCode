package com.tree;

public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        return numTrees(1, n);
    }

    public static int numTrees(int start, int end) {
        if (start >= end) {
            return 1;
        }

        int countUniques = 0;
        for (int i = start; i <= end; i++) { //take i as root
            countUniques += numTrees(start, i - 1) * numTrees(i + 1, end);
        }

        return countUniques;
    }
}
