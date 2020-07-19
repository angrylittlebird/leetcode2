package com.learning._20;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @Author: ZHANG
 * @Date: 2020/7/19
 * @Description:
 */
public class SolutionTest2 {

    @Test
    public void isValid() {
        SolutionLittleOptimize solution = new SolutionLittleOptimize();
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