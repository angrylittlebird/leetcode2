package com.learning._290;

import java.util.HashMap;

/**
 * @Author: ZHANG
 * @Date: 2020/5/9
 * @Description: Given a pattern and a string str, find if str follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 * <p>
 * Example 1:
 * <p>
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: true
 * Example 2:
 * <p>
 * Input:pattern = "abba", str = "dog cat cat fish"
 * Output: false
 * Example 3:
 * <p>
 * Input: pattern = "aaaa", str = "dog cat cat dog"
 * Output: false
 * Example 4:
 * <p>
 * Input: pattern = "abba", str = "dog dog dog dog"
 * Output: false
 * Notes:
 * You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-pattern
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strArr = str.split(" ");
        if (pattern.length() != strArr.length) return false;

        HashMap<Character, String> patternToChar = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char pc = pattern.charAt(i);
            if (patternToChar.containsKey(pc)) {
                if (!strArr[i].equals(patternToChar.get(pc))) {
                    return false;
                }
            } else if (!patternToChar.containsValue(strArr[i])) {
                patternToChar.put(pc, strArr[i]);
            } else {
                return false;
            }
        }
        return true;
    }
}
