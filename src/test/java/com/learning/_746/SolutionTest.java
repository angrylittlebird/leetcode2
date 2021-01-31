package com.learning._746;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: ZHANG
 * @Date: 2021/1/31
 * @Description:
 */
public class SolutionTest {

    @Test
    public void minCostClimbingStairs() {
        int[] costs = {10, 15, 20};
        Solution solution = new Solution();
        int i = solution.minCostClimbingStairs(costs);
        assertEquals(15, i);

        int[] costs2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        Solution solution2 = new Solution();
        int i2 = solution2.minCostClimbingStairs(costs2);
        assertEquals(6, i2);
    }
}