package com.learning._205;

/**
 * @Author: ZHANG
 * @Date: 2020/5/9
 * @Description: Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 * <p>
 * Input: s = "paper", t = "title"
 * Output: true
 * Note:
 * You may assume both s and t have the same length.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/isomorphic-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SolutionOptimize {
    public boolean isIsomorphic(String s, String t) {
        return isIsomorphicHelper(s, t) && isIsomorphicHelper(t, s); //正反比较一下就可以不用判断HashMap中的value是否存在了（46行）
    }

    private boolean isIsomorphicHelper(String s, String t) {

        if (s.length() != t.length()) return false;

//        HashMap<Character, Character> reflect = new HashMap<>();
        Character[] reflect = new Character[128];
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (reflect[sChar] == null) {
//                if (reflect.containsValue(tChar)) return false;
                reflect[sChar] = tChar;
            } else {
                if (reflect[sChar] != tChar) return false;
            }
        }

        return true;
    }
}
