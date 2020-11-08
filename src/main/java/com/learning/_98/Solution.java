package com.learning._98;

import com.learning.TreeNode;

/**
 * @Author: ZHANG
 * @Date: 2020/11/4
 * @Description:
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, null, null);
    }

    private boolean isValidBSTHelper(TreeNode root, Integer lower, Integer upper) {
        if (root == null) return true;

        if (lower != null && root.val <= lower) return false;
        if (upper != null && root.val >= upper) return false;

        return isValidBSTHelper(root.left, lower, root.val) && isValidBSTHelper(root.right, root.val, upper);
    }
}
