package com.learning._209;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: ZHANG
 * @Date: 2020/4/19
 * @Description:
 */
public class SolutionTest {

    @Test
    public void minSubArrayLen() {
        Solution solution = new Solution();
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