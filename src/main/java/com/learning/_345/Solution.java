package com.learning._345;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2020/4/13
 * @Description: Write a function that takes a string as input and reverse only the vowels of a string.
 * <p>
 * Example 1:
 * <p>
 * Input: "hello"
 * Output: "holle"
 * Example 2:
 * <p>
 * Input: "leetcode"
 * Output: "leotcede"
 * Note:
 * The vowels does not include the letter "y".
 * <p>
 */
public class Solution {
    public String reverseVowels(String s) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            while (i < j && !vowels.contains(chars[i])) i++;
            while (j > i && !vowels.contains(chars[j])) j--;

            if (i < j) {
                swap(chars, i, j);
            }
        }
        return String.valueOf(chars);
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
