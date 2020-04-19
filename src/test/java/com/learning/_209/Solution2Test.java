package com.learning._209;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: ZHANG
 * @Date: 2020/4/19
 * @Description:
 */
public class Solution2Test {

    @Test
    public void minSubArrayLen() {
        Solution2 solution = new Solution2();
        int i = solution.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        assertEquals(2, i);

        i = solution.minSubArrayLen(7, new int[]{2, 3});
        assertEquals(0, i);

        i = solution.minSubArrayLen(7, new int[]{3, 4, 2});
        assertEquals(2, i);

        i = solution.minSubArrayLen(3, new int[]{2, 3});
        assertEquals(1, i);
    }
}