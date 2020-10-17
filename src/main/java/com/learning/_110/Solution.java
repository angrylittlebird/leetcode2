package com.learning._110;

import com.learning.TreeNode;

/**
 * @Author: ZHANG
 * @Date: 2020/10/17
 * @Description:
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int distance = Math.abs(getHigh(root.left) - getHigh(root.right));
        if (distance > 1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int getHigh(TreeNode root) {
        if (root == null) return 0;

        int leftHigh = getHigh(root.left);
        int rightHigh = getHigh(root.right);

        return Math.max(leftHigh, rightHigh) + 1;
    }
}
