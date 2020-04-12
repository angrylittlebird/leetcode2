package com.learning._167;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @Author: ZHANG
 * @Date: 2020/4/12
 * @Description:
 */
public class Solution2Test {
    @Test
    public void twoSum() {
        Solution2 solution = new Solution2();
        int[] ints = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{1, 2}, ints);
    }
}