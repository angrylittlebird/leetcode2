package com.learning._125;

/**
 * @Author: ZHANG
 * @Date: 2020/4/12
 * @Description: Given a string, determine if it is a palindrome, considering only alphanumeric(字母数字) characters and ignoring cases.
 * <p>
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * <p>
 * Example 1:
 * <p>
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 * <p>
 * Input: "race a car"
 * Output: false
 * <p>
 * 分享个字母大小写转换的方法：
 * 统一转成大写：ch & 0b11011111 简写：ch & 0xDF
 * 统一转成小写：ch | 0b00100000 简写：ch | 0x20
 * 比较的时候注意加上小括号哦，因为位运算优先级比较低。
 */
public class Solution2 {
    public boolean isPalindrome2(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (i < s.length() && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (j >= 0 && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (i == s.length() || j == -1) return true; // 只要i，j冲出边界那么s就只有一个alphanumeric或没有alphanumeric，此时都应返回true。
            if ((s.charAt(i) & 0xDF) != (s.charAt(j) & 0xDF)) return false;
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (j > i && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (i > j ) return true; // 只要i，j冲出边界那么s就只有一个alphanumeric或没有alphanumeric，此时都应返回true。
            if ((s.charAt(i) & 0xDF) != (s.charAt(j) & 0xDF)) return false;
        }
        return true;
    }
}
