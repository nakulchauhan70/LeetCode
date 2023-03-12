package com;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public static void main(String[] args) {
        getRow(5);
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();

        if (0 <= rowIndex) {
            pascalsTriangle.add(new ArrayList<Integer>() {{
                add(1);
            }});
        }

        if (1 <= rowIndex) {
            pascalsTriangle.add(new ArrayList<Integer>() {{
                add(1);
                add(1);
            }});
        }

        int i = 2;
        while (i <= rowIndex) {
            List<Integer> list = new ArrayList<>();
            list.add(0, 1);
            List<Integer> integers = pascalsTriangle.get(i - 1);
            for (int j = 1; j < i; j++) {
                list.add(j, integers.get(j - 1) + integers.get(j));
            }
            list.add(1);
            pascalsTriangle.add(list);
            i++;
        }

        return pascalsTriangle.get(pascalsTriangle.size() - 1);
    }
}
