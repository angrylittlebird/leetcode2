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
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length == 0) return 0;

        int l = 0, r = 0;
        int res = Integer.MAX_VALUE;
        int sum = nums[l];

        while (r < nums.length - 1) {
            while (r + 1 < nums.length && sum < s) {
                sum += nums[++r];
            }

            if (l == 0 && sum < s) return 0; // when total sum less than s.

            while (l <= r && sum >= s) { // sum = [l,r],  sum([l-1,r]) >= s && sum([l,r]) < s
                sum -= nums[l++];
            }

            if (l <= r && r - l + 2 < res) res = r - l + 2;
            else if (l > r) return 1;

        }

        return res;
    }
}
