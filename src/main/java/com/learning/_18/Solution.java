package com.learning._18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2020/5/10
 * @Description: Given an array nums of n integers and an integer target, are there elements a, b, c,
 * and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate quadruplets.
 * <p>
 * Example:
 * <p>
 * Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
 * <p>
 * A solution set is:
 * [
 * [-1,  0, 0, 1],
 * [-2, -1, 1, 2],
 * [-2,  0, 0, 2]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/4sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
// O(NlogN) + O(N^3)
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {
            // key part to reduce the not necessary working.
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] < target) break;
            if (nums[i] + nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] < target) continue;
            //end


            if (i != 0 && nums[i] == nums[i - 1]) continue;
            for (int k = i + 1; k < nums.length - 2; k++) {
                // key part to reduce the not necessary working.
                if (nums[i] + nums[k] + nums[nums.length - 1] + nums[nums.length - 2] < target) continue;
                if (nums[i] + nums[k] + nums[k + 1] + nums[k + 2] > target) continue;
                //end

                if (k != i + 1 && nums[k] == nums[k - 1]) continue;

                int l = k + 1, r = nums.length - 1;

                int complement = target - nums[i] - nums[k];
                while (l < r) {
                    int sum = nums[l] + nums[r];
                    if (complement < sum) {
                        r--;
                    } else if (complement > sum) {
                        l++;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[k], nums[l], nums[r]));
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1]) l++;
                        while (l < r && nums[r] == nums[r + 1]) r--;
                    }
                }
            }
        }

        return res;
    }
}
