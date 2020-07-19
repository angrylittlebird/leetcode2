package com.learning._20;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Author: ZHANG
 * @Date: 2020/7/19
 * @Description:
 */
public class SolutionLittleOptimize {
    HashMap<Character, Character> characters = new HashMap<>();

    public SolutionLittleOptimize() {
        characters.put(']', '[');
        characters.put(')', '(');
        characters.put('}', '{');
    }

    public boolean isValid(String s) {
        if (s == null) return true;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (characters.containsKey(c)) {
                char popElement = stack.isEmpty() ? '#' : stack.pop();
                if (popElement != characters.get(c)) return false;
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
