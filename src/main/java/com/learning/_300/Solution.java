package com.learning._300;

/**
 * @Author: ZHANG
 * @Date: 2021/2/22
 * @Description:
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] memo = new int[nums.length];
        lengthOfLIS(nums, nums.length - 1, memo);

        int res =1;
        for (int i = 0; i < memo.length; i++) {
            if(memo[i] > res) res = memo[i];
        }
        return res;
    }


    //[0,i] 之间的最长递增子序列
    private int lengthOfLIS(int[] nums, int i, int[] memo) {
        if (i == 0) {
            memo[i] = 1;
            return memo[i];
        }
        if (memo[i] != 0) return memo[i];

        int res = 1;
        for (int j = 0; j < i; j++) {
            if (nums[i] > nums[j]) {
                res = Math.max(res, lengthOfLIS(nums, j, memo) + 1);
            }
        }
        memo[i] = res;

        return memo[i];
    }
}
