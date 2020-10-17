package com.learning._104;

import com.learning.TreeNode;

/**
 * @Author: ZHANG
 * @Date: 2020/10/17
 * @Description:
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode root, int level) {
        if (root == null) return level;
        return Math.max(maxDepth(root.left, level + 1), maxDepth(root.right, level + 1));
    }
}
