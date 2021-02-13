package com.learning._392;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * @Author: ZHANG
 * @Date: 2021/2/13
 * @Description:
 */
public class SolutionTest {

    @Test
    public void isSubsequence() {
        Solution solution = new Solution();
        boolean subsequence = solution.isSubsequence("acb", "ahbgdc");
        assertFalse(subsequence);
    }
}