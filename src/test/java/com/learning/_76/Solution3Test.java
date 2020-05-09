package com.learning._76;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: ZHANG
 * @Date: 2020/5/8
 * @Description:
 */
public class Solution3Test {

    @Test
    public void minWindow() {
        Solution3 solution3 = new Solution3();
        String s = solution3.minWindow("aa", "aa");
        assertEquals("aa",s);
    }
}