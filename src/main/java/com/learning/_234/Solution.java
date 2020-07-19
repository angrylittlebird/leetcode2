package com.learning._234;

import com.learning.ListNode;

import java.util.Stack;

/**
 * @Author: ZHANG
 * @Date: 2020/7/14
 * @Description:
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode curNode = head;
        Stack<ListNode> queue = new Stack<>();
        while (curNode != null) {
            queue.push(curNode);
            curNode = curNode.next;
        }

        while (!queue.isEmpty()) {
            ListNode node = queue.pop();
            if(node.val != head.val) return false;
            head = head.next;
        }
        return true;
    }

}
