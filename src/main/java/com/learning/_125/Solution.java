package com.learning._125;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

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
 */
public class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String currentChar = String.valueOf(s.charAt(i));
            if(currentChar.matches("[0-9a-zA-Z]")){
                list.add(currentChar);
            }
        }

        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            if (!list.get(i).toLowerCase().equals(list.get(j).toLowerCase())) {
                return false;
            }
        }

        return true;
    }
}
