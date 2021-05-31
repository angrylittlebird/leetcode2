package com.learning._17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2021/5/30
 * @Description:
 */
public class Solution2 {
    List<String> res = new ArrayList<>();
//    HashMap<Character, List<String>> map;
//
//    {
//        map = new HashMap<>();
//        map.put('2', Arrays.asList("a", "b", "c"));
//        map.put('3', Arrays.asList("d", "e", "f"));
//        map.put('4', Arrays.asList("g", "h", "i"));
//        map.put('5', Arrays.asList("j", "k", "l"));
//        map.put('6', Arrays.asList("m", "n", "o"));
//        map.put('7', Arrays.asList("p", "q", "r", "s"));
//        map.put('8', Arrays.asList("t", "u", "v"));
//        map.put('9', Arrays.asList("w", "x", "y", "z"));
//    }

    String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return Arrays.asList();
        letterCombinations(digits, 0, new StringBuilder());
        return res;
    }

    public void letterCombinations(String digits, int index, StringBuilder combination) {
        if (index == digits.length()) {
            res.add(combination.toString());
            return;
        }

        for (char currentChar : map[digits.charAt(index) - '0'].toCharArray()) {
            StringBuilder currentCombination = new StringBuilder(combination);
            letterCombinations(digits, index + 1, currentCombination.append(currentChar));
        }
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        List<String> strings = solution.letterCombinations("23");
        System.out.println(strings);
    }
}
