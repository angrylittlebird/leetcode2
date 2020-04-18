package com.learning._11;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: ZHANG
 * @Date: 2020/4/18
 * @Description:
 */
public class SolutionTest {

    @Test
    public void maxArea() {
        Solution solution = new Solution();
        int i = solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        assertEquals(49, i);

        i = solution.maxArea(new int[]{1});
        assertEquals(0, i);

        i = solution.maxArea(new int[]{1,8});
        assertEquals(1, i);
    }
}