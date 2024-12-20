package com.array;

public class NumberofStepstoReduceaNumbertoZero {
    public int numberOfSteps(int num) {
        int steps = 0;

        while (num != 0) {
            if (num % 2 == 1) {
                num--;
            } else {
                num = num / 2;
            }
            steps++;
        }
        return steps;
    }
}
