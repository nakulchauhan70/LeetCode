package com.patterns.prefixsum;

public class FindthePivotInteger {
    public int pivotInteger(int n) {
        if (n == 1) {
            return 1;
        }
        //n=8
        //1,3,6,10,15,21,28,36
        int sum = 0;
        int ans = -1;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            sum += (i + 1);
            arr[i] = sum;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == (sum - arr[i])) {
                ans = i + 1;
                break;
            }
        }

        return ans;
    }
}
