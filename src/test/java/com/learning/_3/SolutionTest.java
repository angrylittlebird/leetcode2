package com.learning._3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: ZHANG
 * @Date: 2020/4/23
 * @Description:
 */
public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        Solution solution = new Solution();
        int res = solution.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3,res);

        res = solution.lengthOfLongestSubstring("bbbbb");
        assertEquals(1, res);

        res = solution.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, res);

        res = solution.lengthOfLongestSubstring("");
        assertEquals(0, res);
    }
}