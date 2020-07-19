package com.learning._150;

/**
 * @Author: ZHANG
 * @Date: 2020/7/19
 * @Description:
 */
public class Solution2 {
    public int evalRPN(String[] tokens) {
        int[] numStack = new int[tokens.length / 2 + 1];

        int index = 0;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    numStack[index - 2] += numStack[--index];
                    break;
                case "-":
                    numStack[index - 2] -= numStack[--index];
                    break;
                case "*":
                    numStack[index - 2] *= numStack[--index];
                    break;
                case "/":
                    numStack[index - 2] /= numStack[--index];
                    break;
                default:
                    numStack[index++] = Integer.parseInt(token);
            }
        }
        return numStack[0];
    }
}
