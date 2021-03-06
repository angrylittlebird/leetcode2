package com.learning._111;

import com.learning.TreeNode;

/**
 * @Author: ZHANG
 * @Date: 2020/10/17
 * @Description:
 */
public class Solution2 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int leftMinDepth = minDepth(root.left);
        int rightMinDepth = minDepth(root.right);

        return (leftMinDepth == 0 || rightMinDepth == 0) ? leftMinDepth + rightMinDepth + 1 : Math.min(leftMinDepth, rightMinDepth) + 1;
    }
}
