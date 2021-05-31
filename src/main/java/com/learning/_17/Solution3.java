package com.learning._17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2021/5/30
 * @Description:
 */
public class Solution3 {
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
        LinkedList<String> queue = new LinkedList<>();
        queue.add("");
        for (char c : digits.toCharArray()) {
            List<String> currentOptions = map.get(c);
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String sb = queue.removeFirst();
                for (String currentOption : currentOptions) {
                    StringBuilder currentStringBuilder = new StringBuilder(sb);
                    currentStringBuilder.append(currentOption);
                    queue.addLast(currentStringBuilder.toString());
                }
            }
        }
        return queue;
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        List<String> strings = solution.letterCombinations("23");
        System.out.println(strings);
    }
}
