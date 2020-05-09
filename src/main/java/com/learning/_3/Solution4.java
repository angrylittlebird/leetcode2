package com.learning._3;

import java.util.HashMap;

/**
 * @Author: ZHANG
 * @Date: 2020/4/23
 * @Description: Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Solution4 {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int l = 0, r = 0;//[l,r)
        HashMap<Character, Integer> window = new HashMap<>();

        while (r < s.length()) {
            char c = s.charAt(r++);
            window.put(c, window.getOrDefault(c, 0) + 1);

            while (window.get(c) > 1) {
                char c2 = s.charAt(l++);
                window.put(c2, window.get(c2) - 1);
            }

            res = Math.max(res, r - l);
        }

        return res;
    }
}
