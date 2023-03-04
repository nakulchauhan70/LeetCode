package com;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 1, 25, 4}));
    }

    public static int maxProfit(int[] prices) {
        int left = 0;    //buy
        int right = 1;   //sell

        int profit = 0; //if profit on next day is negative or less then why would someone buy stock on day 1. Stock must be bought on next day.

        while (left <= right && right < prices.length) {
            int diff = prices[right] - prices[left];
            if (prices[right] < prices[left]) {
                left++;
            } else {
                right++;
            }

            profit = Math.max(profit, diff);
        }

        return profit;
    }
}
