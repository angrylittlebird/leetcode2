package com.learning._746;

/**
 * @Author: ZHANG
 * @Date: 2021/1/31
 * @Description:
 */
public class Solution2 {
    public int minCostClimbingStairs(int[] cost) {
        // 爬到第index层所需花费的全部体力
        int[] dp = new int[cost.length + 1];
        for (int i = 2; i <= cost.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[cost.length];
    }
}
