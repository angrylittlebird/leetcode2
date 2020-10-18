package com.learning._404;

import com.learning.TreeNode;
import org.junit.Test;

/**
 * @Author: ZHANG
 * @Date: 2020/10/18
 * @Description:
 */
public class SolutionTest {

    @Test
    public void sumOfLeftLeaves() {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        int i = solution.sumOfLeftLeaves(treeNode);
        System.out.println(i);
    }
}