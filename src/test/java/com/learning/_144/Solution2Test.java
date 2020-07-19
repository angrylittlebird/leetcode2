package com.learning._144;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @Author: ZHANG
 * @Date: 2020/7/19
 * @Description:
 */
public class Solution2Test {

    @Test
    public void preorderTraversal() {
        Solution2 solution = new Solution2();
        List<Integer> integers = solution.preorderTraversal(null);
        assertEquals(Arrays.asList(),integers);
    }
}