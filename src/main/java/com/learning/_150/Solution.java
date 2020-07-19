package com.learning._150;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

/**
 * @Author: ZHANG
 * @Date: 2020/7/19
 * @Description:
 */
public class Solution {
    public int evalRPN(String[] tokens) throws Exception {
        if (tokens == null || tokens.length == 0) return 0;

        HashSet<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        Stack<Integer> integers = new Stack<>();

        for (String token : tokens) {
            if (operators.contains(token)) {
                Integer result = integers.pop();
                Integer pop = integers.pop();
                integers.push(getResult(pop, result, token));
            } else {
                integers.push(Integer.valueOf(token));
            }
        }

        return integers.pop();
    }

    public Integer getResult(int a, int b, String operation) throws Exception {
        Integer result;
        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new Exception("This operation is not support.");
        }
        return result;
    }
}
