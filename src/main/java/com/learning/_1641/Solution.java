package com.learning._1641;

/**
 * @Author: ZHANG
 * @Date: 2021/2/14
 * @Description:
 */
public class Solution {
    public int countVowelStrings(int n) {
        int[][] dp = new int[n][5];
        //第0层分别以字符a,e,i,o,u结尾的个数
        dp[0][0] = dp[0][1] = dp[0][2] = dp[0][3] = dp[0][4] = 1;

        for (int i = 1; i < n; i++) {
            //第i层的u可以追加在上层任意位置，
            dp[i][4] = dp[i-1][4] + dp[i-1][3] + dp[i-1][2] + dp[i-1][1] + dp[i-1][0];
            //第i层的‘o’只可以追加在上一层以 o,i,e,a 结尾的字符后面
            dp[i][3] = dp[i-1][3] + dp[i-1][2] + dp[i-1][1] + dp[i-1][0];
            dp[i][2] = dp[i-1][2] + dp[i-1][1] + dp[i-1][0];
            dp[i][1] = dp[i-1][1] + dp[i-1][0];
            dp[i][0] = dp[i-1][0];
        }

        return dp[n - 1][0] + dp[n - 1][1] + dp[n - 1][2] + dp[n - 1][3] + dp[n - 1][4];
    }
}
