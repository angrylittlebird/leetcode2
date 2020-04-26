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
public class Solution {
    public String minWindow(String s, String t) {
        String ans = "";

        HashMap<Character, Integer> needs = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            needs.put(t.charAt(i), needs.getOrDefault(t.charAt(i), 0) + 1);
        }

        char[] chars = s.toCharArray();

        int l = 0, r = -1;

        HashMap<Character, Integer> windows = new HashMap<>();
        Set<Character> needsChar = needs.keySet();

        //每当windows中的一个字符的频率符合needs中要求的频率时valid就加1，当valid==needs.size时，区间[l,r]中的字符串就是符合t的子串了。
        int valid = 0;

        while (r + 1 < chars.length) {

            // r一直向右移，直到包含所有所需要的字符
            while (r + 1 < s.length() && valid < needs.size()) {
                char currR = chars[++r];

                if (needsChar.contains(currR)) {
                    int currRFreq = windows.getOrDefault(currR, 0) + 1;
                    windows.put(currR, currRFreq);
                    if (currRFreq == needs.get(currR)) valid++;
                }
            }

            if (valid != needs.size()) return ans;

            // l一直向右移动，[l-1,r] 区间必须一直包含所需要的字符串
            while (valid == needs.size()) {
                char currL = chars[l++];

                if (needsChar.contains(currL)) {
                    int currLFreq = windows.get(currL) - 1;
                    windows.put(currL, currLFreq);
                    if (currLFreq < needs.get(currL)) valid--;
                }
            }

            if ("".equals(ans)) {
                ans = s.substring(l - 1, r + 1);
            } else {
                ans = r - l + 2 < ans.length() ? s.substring(l - 1, r + 1) : ans;
            }
        }

        return ans;
    }
}
