package com.learning._80;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: ZHANG
 * @Date: 2020/3/28
 * @Description:
 */
public class Solution2Test {

    @Test
    public void removeDuplicates() {
        Solution2 solution2 = new Solution2();
        int[] nums = new int[]{0, 0, 0};
        int i = solution2.removeDuplicates(nums);
        Assert.assertEquals(i, 2);
        for (int j = 0; j < i; j++) {
            System.out.print(nums[i] + ",");
        }

        System.out.println();
        nums = new int[]{0, 1, 1};
        i = solution2.removeDuplicates(nums);
        Assert.assertEquals(i, 3);
        for (int j = 0; j < i; j++) {
            System.out.print(nums[j] + ",");
        }

        System.out.println();
        nums = new int[]{0, 1, 1, 1, 2};
        i = solution2.removeDuplicates(nums);
        Assert.assertEquals(i, 4);
        for (int j = 0; j < i; j++) {
            System.out.print(nums[j] + ",");
        }
    }
}