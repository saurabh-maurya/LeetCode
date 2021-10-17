package com.leetcode.problems;

import java.util.Arrays;

public class BestTimeToBuySellStock {
    static int maxProfit(int[] prices){
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int[] prices = {17,1,5,13,6,4};
        System.out.println(maxProfit(prices));
    }
}
