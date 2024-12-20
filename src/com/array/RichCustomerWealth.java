package com.array;

public class RichCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            int customerMaxWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                customerMaxWealth += accounts[i][j];
            }
            max = Integer.max(customerMaxWealth, max);
        }

        return max;
    }
}
