package com.learning._112;

import com.learning.TreeNode;

/**
 * @Author: ZHANG
 * @Date: 2020/10/18
 * @Description:
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        if(root.left == null && root.right == null) return root.val == sum;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
