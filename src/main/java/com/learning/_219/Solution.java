package com.learning._219;

import java.util.HashSet;

/**
 * @Author: ZHANG
 * @Date: 2020/5/18
 * @Description: Given an array of integers and an integer k, find out whether there are two distinct indices i and j
 * in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 * <p>
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/contains-duplicate-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> integers = new HashSet<>();

        int l = 0, r = 0;//[l,r)
        while (r < nums.length) {
            if (l + k == r - 1) {
                integers.remove(nums[l++]);
            }

            if (integers.contains(nums[r])) {
                return true;
            } else {
                integers.add(nums[r++]);
            }

        }
        return false;
    }
}
