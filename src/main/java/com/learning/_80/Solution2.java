package com.learning._80;

import java.util.Objects;

/**
 * @Author: ZHANG
 * @Date: 2020/3/26
 * @Description:
 */
public class Solution2 {
    public int removeDuplicates(int[] nums) {
        Objects.requireNonNull(nums);
        if (nums.length < 3) {
            return nums.length;
        }

        //[0,k], nums[k-2] != nums[k]
        int k = 1;

        for (int i = k + 1; i < nums.length; i++) {
            if (nums[k] != nums[k - 1]) {
                if (i < nums.length - 1 && nums[i + 1] != nums[k]) {
                    nums[k + 1] = nums[i];
                    nums[k + 2] = nums[i + 1];
                    k += 2;
                    i++;
                } else { // 处理该条件下，最后一个元素产生的边界问题
                    nums[k + 1] = nums[i];
                    k++;
                }
            } else {
                if (nums[i] != nums[k]) {
                    nums[k + 1] = nums[i];
                    k++;
                }
            }
        }

        return k + 1;
    }
}
