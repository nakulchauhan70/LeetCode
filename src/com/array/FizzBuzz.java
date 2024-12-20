package com.array;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzz = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            fizzBuzz.add(validateFizzBuzz((i)));
        }

        return fizzBuzz;
    }

    private static String validateFizzBuzz(int i) {
        String res = String.valueOf(i);
        if (i % 3 == 0 && i % 5 == 0) {
            res = "FizzBuzz";
        } else if (i % 3 == 0) {
            res = "Fizz";
        } else if (i % 5 == 0) {
            res = "Buzz";
        }

        return res;
    }
}
