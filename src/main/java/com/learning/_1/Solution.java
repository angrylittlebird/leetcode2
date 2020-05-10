package com.learning._1;

import java.util.HashMap;

/**
 * @Author: ZHANG
 * @Date: 2020/5/9
 * @Description: Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        HashMap<Integer, Integer> valueToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {//O(N)
            int other = target - nums[i];
            if (valueToIndex.containsKey(other)) {

                res[0] = i;
                res[1] = valueToIndex.get(other);
                return res;
            }
            valueToIndex.put(nums[i], i);
        }
        return res;
    }
}
