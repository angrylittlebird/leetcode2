package com.learning._20;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Author: ZHANG
 * @Date: 2020/7/19
 * @Description:
 */
public class Solution {
    HashMap<Character, Character> characters = new HashMap<>();

    {
        characters.put('[', ']');
        characters.put('(', ')');
        characters.put('{', '}');
    }

    public boolean isValid(String s) {
        if (s == null) return true;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (characters.containsKey(c)) {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                Character key = stack.pop();
                if (!characters.get(key).equals(c)) return false;
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
