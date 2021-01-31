package com.learning._1025;

/**
 * @Author: ZHANG
 * @Date: 2021/1/31
 * @Description:
 */
public class Solution {
    public boolean divisorGame(int N) {
        boolean[] dp = new boolean[N + 1];
        for (int i = 2; i <= N ; i++) {
            boolean flag = true;
            for (int j = 1; j < i; j++) {
                if(i % j != 0) continue;
                flag &= dp[i - j];
            }
            if(!flag) dp[i] = true;
        }

        return dp[N];
    }
}
