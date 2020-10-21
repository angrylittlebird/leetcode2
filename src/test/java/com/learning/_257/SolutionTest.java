package com.learning._257;

import com.learning.TreeNode;
import org.junit.Test;

import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2020/10/19
 * @Description:
 */
public class SolutionTest {

    @Test
    public void binaryTreePaths() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        Solution solution = new Solution();
        List<String> strings = solution.binaryTreePaths(treeNode);
        System.out.println(strings);
    }
}