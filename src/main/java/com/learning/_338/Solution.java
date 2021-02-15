package com.learning._338;

/**
 * @Author: ZHANG
 * @Date: 2021/2/15
 * @Description:
 */
public class Solution {
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        dp[0] = 0;
        if (num == 0) return dp;
        dp[1] = 1;

        int index = 1;
        while (index < num) {
            int curIndex = index;
            for (int i = 0; i <= curIndex; i++) {
                dp[++index] = dp[i] + 1;
                if (index == num) return dp;
            }
        }

        return dp;
    }
}
