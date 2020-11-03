package com.learning._437;

import com.learning.TreeNode;

/**
 * @Author: ZHANG
 * @Date: 2020/10/23
 * @Description:
 */
public class Solution {
    /**
     * 从 root节点 开始遍历，返回和为 sum 的路劲总数
     */
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;

        return pathSumFromRoot(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    /**
     * 在以root为根节点的二叉树中， 返回包含root节点，和为 sum 的路径总数
     */
    private int pathSumFromRoot(TreeNode root, int sum){
        if (root == null) return 0;

        int res = 0;
        if (sum == root.val) res = 1;

        return res + pathSumFromRoot(root.left, sum - root.val) + pathSumFromRoot(root.right, sum - root.val);
    }
}
