package com.learning._451;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @Author: ZHANG
 * @Date: 2020/5/9
 * @Description:
 */
public class Solution2Test {

    @Test
    public void frequencySort() {
        Solution2 solution = new Solution2();
        String tree = solution.frequencySort("tree");
        assertTrue(tree.startsWith("ee"));
    }
}