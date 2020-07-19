package com.learning._20;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @Author: ZHANG
 * @Date: 2020/7/19
 * @Description:
 */
public class SolutionTest {

    @Test
    public void isValid() {
        Solution solution = new Solution();
        boolean valid = solution.isValid(null);
        assertTrue(valid);

        valid = solution.isValid("(");
        assertFalse(valid);

        valid = solution.isValid("()");
        assertTrue(valid);

        valid = solution.isValid("({[]})");
        assertTrue(valid);

        valid = solution.isValid("(){}[]");
        assertTrue(valid);

        valid = solution.isValid("))");
        assertFalse(valid);
    }
}