package com.learning._76;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: ZHANG
 * @Date: 2020/4/26
 * @Description:
 */
public class SolutionTest {

    @Test
    public void minWindow() {
        Solution solution = new Solution();
        String s = solution.minWindow("ADOBECODEBANC", "ABC");
        assertEquals("BANC",s);

        s = solution.minWindow("", "ABC");
        assertEquals("",s);
    }
}