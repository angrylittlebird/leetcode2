package com.learning._451;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @Author: ZHANG
 * @Date: 2020/5/9
 * @Description:
 */
public class SolutionTest {

    @Test
    public void frequencySort() {
        Solution solution = new Solution();
        String tree = solution.frequencySort("tree");
        assertTrue(tree.startsWith("ee"));
    }
}