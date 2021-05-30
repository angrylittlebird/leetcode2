//package com.learning._450;
//
//import com.learning.TreeNode;
//
///**
// * @Author: ZHANG
// * @Date: 2020/11/10
// * @Description:
// */
//public class Solution {
//    public TreeNode deleteNode(TreeNode root, int key) {
//        if (root == null || root.val == key) return null;
//
//
//        if(root.left.val == key) root.left = deleteNode(root.left, key);
//        if(root.right.val == key) root.right = deleteNode(root.right, key);
//    }
//}
