package com.leetcode.array;

public class StockBuy {
    public int maxProfit(int[] price) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int buyIndex = 0;
        int sellIndex = 0;
        for(int i = 0; i < price.length; i++){
            if(price[i] < minPrice){
                minPrice = price[i];
                buyIndex = i;
            }else if(price[i] - minPrice > maxProfit){
                maxProfit = price[i] - minPrice;
                sellIndex = i;
            }
        }
        return maxProfit;
    }

    public int maxProfitByDay(int[] prices) {
        int profit = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i] < prices[i + 1]){
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}
