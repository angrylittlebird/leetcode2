package com.learning._746;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: ZHANG
 * @Date: 2021/1/31
 * @Description:
 */
public class Solution2Test {

    @Test
    public void minCostClimbingStairs() {
        int[] costs = {10, 15, 20};
        Solution2 solution = new Solution2();
        int i = solution.minCostClimbingStairs(costs);
        assertEquals(15, i);

        int[] costs2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        Solution2 solution2 = new Solution2();
        int i2 = solution2.minCostClimbingStairs(costs2);
        assertEquals(6, i2);
    }
}