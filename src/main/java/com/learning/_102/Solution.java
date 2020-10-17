package com.learning._102;

import com.learning.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Author: ZHANG
 * @Date: 2020/8/22
 * @Description: Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * <p>
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its level order traversal as:
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 */
class Pair<K,V> implements Map.Entry<K,V>{
    private final K key;
    private V value;
    public Pair(K k,V v) {
        this.key = k;
        this.value = v;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    @Override
    public V setValue(V value) {
        return null;
    }
}
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        LinkedList<Map.Entry<TreeNode, Integer>> queue = new LinkedList<>();
        queue.push(new Pair(root, 1));

        while (!queue.isEmpty()) {
            Map.Entry<TreeNode, Integer> curPair = queue.removeFirst();
            TreeNode treeNode = curPair.getKey();
            Integer level = curPair.getValue();

            if (level > result.size()) {
                result.add(new ArrayList<>());
            }
            result.get(level-1).add(treeNode.val);

            if(treeNode.left != null){
                queue.addLast(new Pair<>(treeNode.left,level+1));
            }
            if (treeNode.right != null) {
                queue.addLast(new Pair<>(treeNode.right,level+1));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.levelOrder(new TreeNode(1));
    }

}
