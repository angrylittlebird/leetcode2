package com.learning._350;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @Author: ZHANG
 * @Date: 2020/5/8
 * @Description:
 */
public class SolutionTest {

    @Test
    public void intersect() {
        Solution solution = new Solution();
        int[] intersect = solution.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        assertArrayEquals(new int[]{2, 2}, intersect);

        intersect = solution.intersect(new int[]{2}, new int[]{1, 2, 2, 1});
        assertArrayEquals(new int[]{2}, intersect);

        intersect = solution.intersect(new int[]{4}, new int[]{1, 2, 2, 1});
        assertArrayEquals(new int[]{}, intersect);
    }
}