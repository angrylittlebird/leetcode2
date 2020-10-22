package com.learning._129;

import com.learning.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2020/10/22
 * @Description:
 */
public class Solution2 {
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        List<List<Integer>> paths = sumNumbersHelper(root);
        for (List<Integer> path : paths) {
            sum += shiftListToNumber(path);
        }
        return sum;
    }

    private int shiftListToNumber(List<Integer> path) {
        int sum = 0;
        for (int i = 0; i < path.size(); i++) {
            sum += path.get(i) * Math.pow(10, i);
        }
        return sum;
    }

    private List<List<Integer>> sumNumbersHelper(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        if (root.left == null && root.right == null) {
            List<Integer> path = new ArrayList<>();
            path.add(root.val);
            res.add(path);
            return res;
        }

        List<List<Integer>> leftPath = sumNumbersHelper(root.left);
        for (List<Integer> path : leftPath) {
            path.add(root.val);
            res.add(path);
        }

        List<List<Integer>> rightPath = sumNumbersHelper(root.right);
        for (List<Integer> path : rightPath) {
            path.add(root.val);
            res.add(path);
        }

        return res;
    }

}
