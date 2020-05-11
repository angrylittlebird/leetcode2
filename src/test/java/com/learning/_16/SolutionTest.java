package com.learning._16;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: ZHANG
 * @Date: 2020/5/11
 * @Description:
 */
public class SolutionTest {

    @Test
    public void threeSumClosest() {
        Solution solution = new Solution();
        int i = solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        assertEquals(2, i);
    }
}