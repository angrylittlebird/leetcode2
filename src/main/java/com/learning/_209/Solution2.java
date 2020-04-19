package com.learning._209;

/**
 * @Author: ZHANG
 * @Date: 2020/4/19
 * @Description: Given an array of n positive integers and a positive integer s,
 * find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
 * <p>
 * Example: 
 * <p>
 * Input: s = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: the subarray [4,3] has the minimal length under the problem constraint.
 * Follow up:
 * If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n). 
 */
public class Solution2 {
    public int minSubArrayLen(int s, int[] nums) {

        // slide window [l,r]
        int l = 0, r = -1;
        int res = nums.length + 1;
        int sum = 0;

        while (l < nums.length) {

            if (r + 1 < nums.length && sum < s) {
                sum += nums[++r];
            } else {
                sum -= nums[l++];
            }

            if (sum >= s) res = Math.min(res, r - l + 1);
        }

        if (res == nums.length + 1) return 0;

        return res;
    }
}
