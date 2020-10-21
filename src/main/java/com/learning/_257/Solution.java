package com.learning._257;

import com.learning.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2020/10/19
 * @Description:
 */
public class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> res = new ArrayList<>();

        if (root == null) return res;

        if (root.left == null && root.right == null) {
            res.add(String.valueOf(root.val));
            return res;
        }

        List<String> leftPath = binaryTreePaths(root.left);
        for (String s : leftPath) {
            res.add(root.val + "->" + s);
        }

        List<String> rightPath = binaryTreePaths(root.right);
        for (String s : rightPath) {
            res.add(root.val + "->" + s);
        }

        return res;
    }
}
