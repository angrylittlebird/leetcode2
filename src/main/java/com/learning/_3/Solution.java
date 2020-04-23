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
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int l = 0, r = -1;
        char[] chars = s.toCharArray();
        // frequency contains the character between l and r, and ensure do not have duplicate character.
        HashMap<Character, Integer> frequency = new HashMap<>();

        while (r + 1 < chars.length) {
            if (frequency.containsKey(chars[++r])) {
                int currentL = frequency.get(chars[r]);

                for (int i = l; i <= currentL; i++) {
                    frequency.remove(chars[i]);
                }

                l = currentL + 1;
            }

            frequency.put(chars[r], r);

            res = Math.max(res, r - l + 1);
        }


        return res;
    }
}
