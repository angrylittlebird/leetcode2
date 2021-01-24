package com.learning._322;

import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2021/1/24
 * @Description:
 */
public class Solution2 {
    public int coinChange(int[] coins, int amount) {
        // index stand for amount, value stand for minimum coin change.
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            for (int coin : coins) {
                if (i - coin < 0) continue;
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }

        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}
