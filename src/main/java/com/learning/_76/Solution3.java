package com.learning._76;

import java.util.HashMap;

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
public class Solution3 {
    public String minWindow(String s, String t) {
        String res = "";
        int l = 0, r = 0;
        int match = 0;
        int curLength = Integer.MAX_VALUE;

        HashMap<Character, Integer> needs = new HashMap<>();
        for (char c : t.toCharArray()) {
            needs.put(c, needs.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> windows = new HashMap<>();

        while (r < s.length()) {
            char c = s.charAt(r++);
            if (needs.containsKey(c)) {
                windows.put(c, windows.getOrDefault(c, 0) + 1);
                if (windows.get(c).intValue() == needs.get(c).intValue()) {
                    match++;
                }
            }

            while (match == needs.size()) {
                if (r - l < curLength) {
                    curLength = r - l;
                    res = s.substring(l, r);
                }

                char c2 = s.charAt(l++);
                if (needs.containsKey(c2)) {
                    Integer oldValue = windows.put(c2, windows.get(c2) - 1);
                    if (oldValue == needs.get(c2).intValue()) {
                        match--;
                    }
                }
            }
        }

        return res;
    }
}
