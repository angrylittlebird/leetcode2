package com.learning._144;

import com.learning.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2020/7/19
 * @Description:
 */
public class Solution {
    ArrayList<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            result.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        return result;
    }
}
