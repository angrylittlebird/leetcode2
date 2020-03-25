package com.learning._26;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: ZHANG
 * @Date: 2020/3/25
 * @Description:
 */
public class SolutionTest {

    @Test
    public void removeDuplicates() {
        Solution solutionTest = new Solution();
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