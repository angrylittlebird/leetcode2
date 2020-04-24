package com.learning._3;

import java.util.Arrays;
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
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int l = 0, r = -1;
        char[] chars = s.toCharArray();
        // frequency contains the character between l and r, and ensure do not have duplicate character.
//        HashMap<Character, Integer> frequency = new HashMap<>();
        //int [26] 用于字母 ‘a’ - ‘z’ 或 ‘A’ - ‘Z’
        //int [128] 用于ASCII码
        //int [256] 用于扩展ASCII码
        int[] frequency = new int[128];
        Arrays.fill(frequency,-1);

        while (r + 1 < chars.length) {
            if (frequency[chars[++r]] >= 0) {
                if(frequency[chars[r]] >= l) {
                    l = frequency[chars[r]] + 1;
                }
            }

            frequency[chars[r]] = r;

            res = Math.max(res, r - l + 1);
        }


        return res;
    }
}
