package com.learning._404;

import com.learning.TreeNode;

/**
 * @Author: ZHANG
 * @Date: 2020/10/18
 * @Description:
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left != null && left.left == null && left.right == null) return left.val + sumOfLeftLeaves(right);

        return sumOfLeftLeaves(left) + sumOfLeftLeaves(right);
    }
}
