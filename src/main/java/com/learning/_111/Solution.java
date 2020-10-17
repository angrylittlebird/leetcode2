package com.learning._111;

import com.learning.TreeNode;

/**
 * @Author: ZHANG
 * @Date: 2020/10/17
 * @Description:
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;

        if (root.left == null && root.right != null) {
            return minDepth(root.right) + 1;
        }

        if (root.left != null && root.right == null) {
            return minDepth(root.left) + 1;
        }

        return Math.min(minDepth(root.left) + 1, minDepth(root.right) + 1);
    }
}
