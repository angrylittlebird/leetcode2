package com.learning._71;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @Author: ZHANG
 * @Date: 2020/7/19
 * @Description:
 */
public class SolutionTest {

    @Test
    public void simplifyPath() {
        Solution solution = new Solution();
        String s = solution.simplifyPath("/2/3");
        assertEquals("/2/3", s);

        s = solution.simplifyPath("/");
        assertEquals("/", s);

        s = solution.simplifyPath(null);
        assertNull(s);

        s = solution.simplifyPath("/a/../../b/c/./../d//");
        assertEquals("/b/d", s);

    }
}