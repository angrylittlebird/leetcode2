package com.learning._17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: ZHANG
 * @Date: 2021/5/30
 * @Description:
 */
public class Solution {
    HashMap<Character, List<String>> map;

    {
        map = new HashMap<>();
        map.put('2', Arrays.asList("a", "b", "c"));
        map.put('3', Arrays.asList("d", "e", "f"));
        map.put('4', Arrays.asList("g", "h", "i"));
        map.put('5', Arrays.asList("j", "k", "l"));
        map.put('6', Arrays.asList("m", "n", "o"));
        map.put('7', Arrays.asList("p", "q", "r", "s"));
        map.put('8', Arrays.asList("t", "u", "v"));
        map.put('9', Arrays.asList("w", "x", "y", "z"));
    }

    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return Arrays.asList();
        return letterCombinations(digits, 0, Arrays.asList(new StringBuilder()));
    }

    public List<String> letterCombinations(String digits, int index, List<StringBuilder> sbs) {
        List<StringBuilder> newSbs = new ArrayList<>();
        List<String> options = map.get(digits.charAt(index));
        for (StringBuilder currentString : sbs) {
            for (String option : options) {
                StringBuilder newSb = new StringBuilder(currentString);
                newSb.append(option);
                newSbs.add(newSb);
            }
        }

        index++;

        if (index < digits.length()) {
            return letterCombinations(digits, index, newSbs);
        }

        return newSbs.stream().map(StringBuilder::toString).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> strings = solution.letterCombinations("23");
        System.out.println(strings);
    }
}
