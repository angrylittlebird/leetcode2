package com.learning._53;

/**
 * @Author: ZHANG
 * @Date: 2021/2/13
 * @Description:
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;

        int sum = 0;
        for (int num : nums) {
            sum += num;
            res = Math.max(res, sum);
            if (sum < 0) sum = 0;
        }

        return res;
    }
}
