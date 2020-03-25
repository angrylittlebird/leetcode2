package com.learning._26;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: ZHANG
 * @Date: 2020/3/26
 * @Description:
 */
public class Solution2Test {

    @Test
    public void removeDuplicates() {
        Solution2 solutionTest = new Solution2();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = solutionTest.removeDuplicates(nums);
        Assert.assertEquals(5, i);
        for (int j = 0; j < i; j++) {
            System.out.print(nums[j] + ",");
        }
        System.out.println();

        nums = new int[]{0, 0, 0};
        i = solutionTest.removeDuplicates(nums);
        Assert.assertEquals(1, i);
        for (int j = 0; j < i; j++) {
            System.out.print(nums[j] + ",");
        }

        System.out.println();

        nums = new int[]{0};
        i = solutionTest.removeDuplicates(nums);
        Assert.assertEquals(1, i);
        for (int j = 0; j < i; j++) {
            System.out.print(nums[j] + ",");
        }
    }
}