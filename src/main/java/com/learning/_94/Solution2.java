package com.learning._94;

import com.learning.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: ZHANG
 * @Date: 2020/7/19
 * @Description:
 */
public class Solution2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> treeNodes = new Stack<>();
        treeNodes.push(root);


        TreeNode pop = treeNodes.pop();
        while (pop != null) {
            if (pop == null) continue;

            treeNodes.push(pop.right);
            treeNodes.push(pop);
            treeNodes.push(pop.left);
        }

        return result;
    }
}
