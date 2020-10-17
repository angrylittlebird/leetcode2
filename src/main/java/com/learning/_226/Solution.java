package com.learning._226;

import com.learning.TreeNode;

/**
 * @Author: ZHANG
 * @Date: 2020/10/17
 * @Description:
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode right = root.right;
        root.right = root.left;
        root.left = right;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
