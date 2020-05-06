package com.learning._76;

import java.util.HashMap;
import java.util.Set;

/**
 * @Author: ZHANG
 * @Date: 2020/4/26
 * @Description: Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).
 * <p>
 * Example:
 * <p>
 * Input: S = "ADOBECODEBANC", T = "ABC"
 * Output: "BANC"
 * Note:
 * <p>
 * If there is no such window in S that covers all characters in T, return the empty string "".
 * If there is such window, you are guaranteed that there will always be only one unique minimum window in S.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-window-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution2 {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> needs = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            needs.put(t.charAt(i), needs.getOrDefault(t.charAt(i), 0) + 1);
        }

        char[] chars = s.toCharArray();

        //[l,r)
        int l = 0, r = 0, len = Integer.MAX_VALUE, start = 0;

        HashMap<Character, Integer> windows = new HashMap<>();
        Set<Character> needsChar = needs.keySet();

        //每当windows中的一个字符的频率符合needs中要求的频率时valid就加1，当valid==needs.size时，区间[l,r]中的字符串就是符合t的子串了。
        int valid = 0;

        while (r < chars.length) {
            // r向右移动1位
            char currR = chars[r++];
            if (needsChar.contains(currR)) {
                windows.put(currR, windows.getOrDefault(currR, 0) + 1);
                if (windows.get(currR).intValue() == needs.get(currR).intValue()) {// 我干，Integer会缓存频繁使用的数值，数值范围为-128到127，在此范围内直接返回缓存值。超过该范围就会new 一个对象。
                    valid++;
                }
            }


            // l一直向右移动，直到[l,r)区间不是t的最小子串
            while (valid == needs.size()) {
                if (r - l < len) {
                    start = l;
                    len = r - l;
                }

                char currL = chars[l++];

                if (needsChar.contains(currL)) {
                    int currLFreq = windows.get(currL) - 1;
                    windows.put(currL, currLFreq);
                    if (currLFreq < needs.get(currL)) valid--;
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}
