package com.learning._129;

import com.learning.TreeNode;

/**
 * @Author: ZHANG
 * @Date: 2020/10/22
 * @Description:
 */
public class Solution {
    public int sumNumbers(TreeNode root) {
        return sumNumbersHelper(root, 0);
    }

    /**
     * @param node
     * @param number
     * @return 返回 根节点 到 所有叶子节点 之间的和
     */
    private int sumNumbersHelper(TreeNode node, int number) {
        if (node == null) return 0;

        int value = number * 10 + node.val;
        if (node.left == null && node.right == null) return value;

        return sumNumbersHelper(node.left, value) + sumNumbersHelper(node.right, value);
    }
}
