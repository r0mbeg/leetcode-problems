package ru.proffen.easy;



//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class _0121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];


        // Find the min value and index of Min
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }

        return maxProfit;
    }
}
