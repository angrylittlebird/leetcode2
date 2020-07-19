package com.learning._144;

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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> treeNodes = new Stack<>();
        treeNodes.push(root);

        while (!treeNodes.isEmpty()) {
            TreeNode pop = treeNodes.pop();
            if(pop == null) continue;
            result.add(pop.val);
            treeNodes.push(pop.right);
            treeNodes.push(pop.left);
        }

        return result;
    }
}
