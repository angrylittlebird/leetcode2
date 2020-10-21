package com.learning._113;

import com.learning.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2020/10/21
 * @Description:
 */
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) return res;
        if (root.left == null && root.right == null && root.val == sum) {
            LinkedList<Integer> path = new LinkedList<>();
            path.add(root.val);
            res.add(path);
            return res;
        }

        List<List<Integer>> leftPathSum = pathSum(root.right, sum - root.val);
        for (List<Integer> paths : leftPathSum) {
            ((LinkedList<Integer>) paths).addFirst(root.val);
            res.add(paths);
        }
        List<List<Integer>> rightPathSum = pathSum(root.left, sum - root.val);
        for (List<Integer> paths : rightPathSum) {
            ((LinkedList<Integer>) paths).addFirst(root.val);
            res.add(paths);
        }

        return res;

    }
}
