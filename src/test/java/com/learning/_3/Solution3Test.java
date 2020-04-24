package com.learning._3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: ZHANG
 * @Date: 2020/4/23
 * @Description:
 */
public class Solution3Test {

    @Test
    public void lengthOfLongestSubstring() {
        Solution3 solution = new Solution3();
        int res = solution.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, res);

        res = solution.lengthOfLongestSubstring("bbbbb");
        assertEquals(1, res);

        res = solution.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, res);

        res = solution.lengthOfLongestSubstring("tmmzuxt");
        assertEquals(5, res);

        res = solution.lengthOfLongestSubstring("");
        assertEquals(0, res);

        res = solution.lengthOfLongestSubstring(" ");
        assertEquals(1, res);
    }
}