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
public class Solution {
    public int removeDuplicates(int[] nums) {
        Objects.requireNonNull(nums);
        if (nums.length < 2) return nums.length;

        //[0,k)区间内的元素不会重复
        int k = 1;

        //[i,j]作为滑动窗口, nums[i] == nums[j-1], nums[j-1] != nums[j]
        int i = 0, j = 1;

        while (j < nums.length) {
            while (j < nums.length && nums[j] == nums[i]) j++;
            if(j >= nums.length) break;
            nums[k] = nums[j];
            k++;
            i = j;
        }

        return k;

    }
}
