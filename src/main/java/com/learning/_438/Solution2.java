package com.learning._438;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2020/4/25
 * @Description: Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 * <p>
 * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
 * <p>
 * The order of output does not matter.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * s: "cbaebabacd" p: "abc"
 * <p>
 * Output:
 * [0, 6]
 * <p>
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 * Example 2:
 * <p>
 * Input:
 * s: "abab" p: "ab"
 * <p>
 * Output:
 * [0, 1, 2]
 * <p>
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-all-anagrams-in-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution2 {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();
        int l = 0, r = 0;

        int[] needs = new int[26];
        for (char c : p.toCharArray()) {
            needs[c - 'a']++;
        }

        int[] windows = new int[26];

        while (r < s.length()) {
            char c = s.charAt(r++);
            windows[c - 'a']++;

            while (needs[c - 'a'] < windows[c - 'a']) {
                windows[s.charAt(l++) - 'a']--;
            }

            if (r - l == p.length()) res.add(l);
        }

        return res;
    }
}
