package com.learning._322;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: ZHANG
 * @Date: 2021/1/24
 * @Description:
 */
public class SolutionTest {
    @Test
    public void coinChange() {
        Solution solution = new Solution();
        int i = solution.coinChange(new int[]{1, 2, 5}, 11);
        assertEquals(3, i);

        solution = new Solution();
        i = solution.coinChange(new int[]{2}, 3);
        assertEquals(-1, i);
    }
}