package com.learning._71;

import java.util.Stack;

/**
 * @Author: ZHANG
 * @Date: 2020/7/19
 * @Description:
 */
public class Solution {
    public String simplifyPath(String path) {
        if (path == null) return null;
        Stack<String> stack = new Stack<>();

        String[] split = path.split("/");
        for (String s : split) {
            switch (s) {
                case "":
                case ".":
                    break;
                case "..":
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                default:
                    stack.push(s);
            }
        }
        if (stack.isEmpty()) return "/";

        StringBuilder sb = new StringBuilder();
        for (String s : stack) {
            sb.append("/").append(s);
        }
        return sb.toString();
    }
}
