package com.learning._105;

import com.learning.TreeNode;

/**
 * @Author: ZHANG
 * @Date: 2021/1/24
 * @Description:
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode cur = root;
        for (int i = 0; i < preorder.length - 1; i++) {
            boolean leftSide = isLeftSide(preorder[i], preorder[i + 1], inorder);
            if (leftSide) {
                cur.left = new TreeNode(preorder[i + 1]);
                cur = cur.left;
            } else {
                cur.right = new TreeNode(preorder[i + 1]);
                cur = cur.right;
            }
        }
        return root;
    }

    private boolean isLeftSide(int parentValue, int childValue, int[] inorder) {
        int parentIndex = -1;
        int childIndex = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == parentValue) parentIndex = i;
            if (inorder[i] == childValue) childIndex = i;
        }
        if (parentIndex == -1 || childIndex == -1) throw new RuntimeException("...");

        return parentIndex > childIndex;
    }
}
