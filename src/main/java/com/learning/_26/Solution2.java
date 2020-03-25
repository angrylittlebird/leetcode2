package com.learning._26;

import java.util.Objects;

/**
 * @Author: ZHANG
 * @Date: 2020/3/23
 * @Description: Example 2:
 * <p>
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 * <p>
 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 * <p>
 * It doesn't matter what values are set beyond the returned length.
 */
public class Solution2 {
    public int removeDuplicates(int[] nums) {
        Objects.requireNonNull(nums);

        // [0,k] 区间为非重复的元素
        int k = 0;

        // 当前索引为i的元素是否和 nums[k] 相等
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                nums[k + 1] = nums[i];
                k++;
            }
        }

        return k + 1;

    }
}
