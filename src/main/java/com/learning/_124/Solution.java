package com.learning._124;

import com.learning.TreeNode;

/**
 * @Author: ZHANG
 * @Date: 2021/1/17
 * @Description:
 */
public class Solution {
    private int res = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        oneSideMax(root);
        return res;
    }

    /**
     * 以node为根节点，其中一侧的最大路劲和，且不一定经过叶子节点
     * @param node
     * @return
     */
    private int oneSideMax(TreeNode node) {
        if (node == null) return 0;

        // The reason why we compare with zero is that we want to get rid of the path when the path is negative
        int leftSideMax = Math.max(0, oneSideMax(node.left));
        int rightSideMax = Math.max(0, oneSideMax(node.right));

        int oneSideMax = Math.max(leftSideMax, rightSideMax) + node.val;
        res = Math.max(res, leftSideMax + rightSideMax + node.val);

        return oneSideMax;
    }
}
