package com.learning._1025;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @Author: ZHANG
 * @Date: 2021/1/31
 * @Description:
 */
public class SolutionTest {

    @Test
    public void divisorGame() {
        Solution solution = new Solution();
        boolean winner = solution.divisorGame(1);
        assertFalse(winner);

        winner = solution.divisorGame(2);
        assertTrue(winner);

        winner = solution.divisorGame(3);
        assertFalse(winner);

        winner = solution.divisorGame(4);
        assertTrue(winner);

        winner = solution.divisorGame(7);
        assertFalse(winner);
    }
}