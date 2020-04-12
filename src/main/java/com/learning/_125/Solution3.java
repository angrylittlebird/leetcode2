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
public class Solution3 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase().replaceAll("[^0-9a-zA-Z]",""));
        return sb.toString().equals(sb.reverse().toString());
    }
}
