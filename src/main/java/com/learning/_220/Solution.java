package com.learning._220;

import java.util.TreeSet;

/**
 * @Author: ZHANG
 * @Date: 2020/5/20
 * @Description: Given an array of integers,
 * find out whether there are two distinct indices i and j in the array
 * such that the absolute difference between nums[i] and nums[j] is at most t
 * and the absolute difference between i and j is at most k.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1], k = 3, t = 0
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [1,0,1,1], k = 1, t = 2
 * Output: true
 * Example 3:
 * <p>
 * Input: nums = [1,5,9,1,5,9], k = 2, t = 3
 * Output: false
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/contains-duplicate-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> integers = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (integers.size() == k + 1) {
                integers.remove((long)nums[i - k - 1]);
            }

            Long ceiling = integers.ceiling((long)nums[i] - (long)t);
            if (ceiling != null && ceiling.longValue() <= (long) nums[i] + (long) t) return true;

            integers.add((long)nums[i]);

//            if (integers.size() == k + 1) {
//                integers.remove((long)nums[i - k]);
//            }

        }

        return false;
    }
}
