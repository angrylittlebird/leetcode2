package com.learning._129;

import com.learning.TreeNode;
import org.junit.Test;

/**
 * @Author: ZHANG
 * @Date: 2020/10/22
 * @Description:
 */
public class SolutionTest {

    @Test
    public void sumNumbers() {
        TreeNode treeNode = new TreeNode(0);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        Solution solution = new Solution();
        int i = solution.sumNumbers(treeNode);
        System.out.println(i);
    }
}