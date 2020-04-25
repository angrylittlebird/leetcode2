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
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();
        char[] chars = s.toCharArray();

        //English letters ==> 26
        // index代表字符，value代表频率
        int[] windows = new int[26];
        int[] needs = new int[26];
        for (int i = 0; i < p.length(); i++) {
            needs[p.charAt(i) - 'a'] += 1;
        }

        //定义chars中[l,r]区间内的字符串是符合anagram规则的（必要非充分）
        int l = 0, r = -1;
        while (r + 1 < chars.length) {
            // r在chars中向右滑动1位，并计算chars[r]在windows和needs下表
            int curRIndex = chars[++r] - 'a';
            windows[curRIndex] += 1;

            while (windows[curRIndex] > needs[curRIndex]) { //此时[l,r]之间的字符已经不符合anagram规则
                // l向右滑动1位
                windows[chars[l++] - 'a'] -= 1;
            }

            if (r - l + 1 == p.length()) res.add(l);
        }

        return res;
    }
}
