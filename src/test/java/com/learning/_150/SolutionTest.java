package com.learning._150;

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
    public void evalRPN() throws Exception {
        String[] strings = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        Solution solution = new Solution();
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

    @Test(expected = Exception.class)
    public void getResult() throws Exception {
        Solution solution = new Solution();
        Integer a = solution.getResult(1, 2, "a");
        assertNull(a);

        a = solution.getResult(1, 2, "*");
        assertNull(2);
    }
}