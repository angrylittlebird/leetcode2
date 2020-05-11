package com.learning._16;

import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2020/5/11
 * @Description: Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 * <p>
 * Example:
 * <p>
 * Given array nums = [-1, 2, 1, -4], and target = 1.
 * <p>
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum-closest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        if (nums[0] + nums[1] + nums[2] >= target) return nums[0] + nums[1] + nums[2];
        if (nums[length - 1] + nums[length - 2] + nums[length - 3] <= target)
            return nums[length - 1] + nums[length - 2] + nums[length - 3];

        int res = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1, r = nums.length - 1;
            int other = target - nums[i];

            while (l < r) {
                int sum = nums[l] + nums[r];
                res = Math.abs(sum - other) > Math.abs(res - target) ? res : sum + nums[i];

                if (sum > other) {
                    r--;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                } else if (sum < other) {
                    l++;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                } else {
                    return target;
                }
            }
        }

        return res;

    }
}
