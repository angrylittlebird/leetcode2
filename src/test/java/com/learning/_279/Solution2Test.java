package com.learning._279;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: ZHANG
 * @Date: 2020/10/12
 * @Description:
 */
public class Solution2Test {

    @Test
    public void numSquares() {
        Solution2 solution2 = new Solution2();
        int i = solution2.numSquares(12);
        assertEquals(3, i);
    }
}