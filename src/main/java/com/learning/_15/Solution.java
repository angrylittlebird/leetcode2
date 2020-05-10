package com.learning._15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2020/5/9
 * @Description: Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate triplets.
 * <p>
 * Example:
 * <p>
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
// O(NlogN) + O(n^2)
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;// keep unique

            int l = i + 1, r = nums.length - 1;
            int target = -nums[i];

            while (l < r) {
                int sum = nums[l] + nums[r];
                if (sum < target) {
                    l++;
                } else if (sum > target) {
                    r--;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l - 1] == nums[l]) l++;// keep unique
                    while (l < r && nums[r + 1] == nums[r]) r--;
                }
            }
        }

        return res;
    }
}
