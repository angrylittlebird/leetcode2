package com.learning._392;

/**
 * @Author: ZHANG
 * @Date: 2021/2/1
 * @Description:
 */
public class Solution {
    public boolean isSubsequence(String s, String t) {
        return isSubsequence(s.toCharArray(), t.toCharArray(), 0, 0);
    }

    private boolean isSubsequence(char[] s, char[] t, int indexS, int indexT) {
        if (indexS == s.length) return true;

        while (indexT < t.length) {
            if (s[indexS] == t[indexT]) {
                return true && isSubsequence(s, t, ++indexS, ++indexT);
            }
            indexT++;
        }
        return false;

    }
}
