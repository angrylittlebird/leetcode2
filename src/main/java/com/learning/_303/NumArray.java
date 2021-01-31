package com.learning._303;


/**
 * @Author: ZHANG
 * @Date: 2021/1/31
 * @Description:
 */
public class NumArray {
    private int dp[];

    public NumArray(int[] nums) {
        dp = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            dp[i + 1] = dp[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return dp[j + 1] - dp[i];
    }

}
