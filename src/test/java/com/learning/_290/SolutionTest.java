package com.learning._290;

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
    public void wordPattern() {
        Solution solution = new Solution();
        boolean b = solution.wordPattern("abba", "dog cat cat dog");
        assertTrue(b);

        b = solution.wordPattern("abba", "dog cat car dog");
        assertFalse(b);

        b = solution.wordPattern("abba", "dog dog dog dog");
        assertFalse(b);

        b = solution.wordPattern("aaaa", "dog cat cat dog");
        assertFalse(b);
    }
}