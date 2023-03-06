package com;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(allProfits(new int[]{7, 1, 5, 3, 6, 4}));//1-5 = 4, 3-6 = 3, Total = 7
    }

    //just one maximum profit
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

    public static int allProfits(int[] prices) {
        int left = 0;
        int right = 1;
        int allProfits = 0;

        while (left < right && right < prices.length) {
            if (prices[right] > prices[left]) {
                allProfits += (prices[right] - prices[left]);
                left = right;
                right++;
            } else {
                left++;
                right++;
            }
        }

        return allProfits;
    }
}
