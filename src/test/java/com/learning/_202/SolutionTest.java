package com.learning._202;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @Author: ZHANG
 * @Date: 2020/5/9
 * @Description:
 */
public class SolutionTest {

    @Test
    public void isHappy() {
        Solution solution = new Solution();
        boolean happy = solution.isHappy(19);
        assertTrue(happy);


        //20,4,16,37,57,84,80,64,52,29,85,89,145,42,20
        happy = solution.isHappy(20);
        assertFalse(happy);
    }
}