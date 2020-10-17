package com.learning._100;

import com.learning.TreeNode;

/**
 * @Author: ZHANG
 * @Date: 2020/10/17
 * @Description:
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;

        if(p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
