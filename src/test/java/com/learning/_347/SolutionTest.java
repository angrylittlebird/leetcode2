package com.learning._347;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: ZHANG
 * @Date: 2020/10/14
 * @Description:
 */
public class SolutionTest {

    @Test
    public void topKFrequent() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int[] ints = new Solution().topKFrequent(nums, 2);
        int[] numsExpected = {1,2};
        Assert.assertArrayEquals(numsExpected,ints);
    }
}