package com.learning._121;

/**
 * @Author: ZHANG
 * @Date: 2021/1/31
 * @Description:
 * 前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int minValueIndex = 0;
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[minValueIndex] > prices[i]) {
                minValueIndex = i;
                continue;
            }

            res = Math.max(res, prices[i] - prices[minValueIndex]);
        }

        return res;
    }
}
