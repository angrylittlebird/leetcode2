package com.learning._98;

import com.learning.TreeNode;

/**
 * @Author: ZHANG
 * @Date: 2020/11/4
 * @Description: using mid-order iterator
 */
public class Solution2 {
    private long pre = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        if(!isValidBST(root.left)){
            return false;
        }

        if(root.val <= pre) return false;
        pre = root.val;

        return isValidBST(root.right);
    }
}
