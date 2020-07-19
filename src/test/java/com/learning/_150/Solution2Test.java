package com.learning._150;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: ZHANG
 * @Date: 2020/7/19
 * @Description:
 */
public class Solution2Test {

    @Test
    public void evalRPN() {
        String[] strings = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        Solution2 solution = new Solution2();
        int i = solution.evalRPN(strings);
        assertEquals(22, i);

        strings = new String[]{"10"};
        i = solution.evalRPN(strings);
        assertEquals(10, i);

        strings = new String[]{"3", "11", "+", "5", "-"};
        i = solution.evalRPN(strings);
        assertEquals(9, i);

        strings = new String[]{"4", "-2", "/", "2", "-3", "-", "-"};
        i = solution.evalRPN(strings);
        assertEquals(-7, i);
    }
}