package com.learning._25;

import com.learning.ListNode;

/**
 * @Author: ZHANG
 * @Date: 2020/6/14
 * @Description: Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 * <p>
 * k is a positive integer and is less than or equal to the length of the linked list.
 * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 * <p>
 * Example:
 * <p>
 * Given this linked list: 1->2->3->4->5
 * <p>
 * For k = 2, you should return: 2->1->4->3->5
 * <p>
 * For k = 3, you should return: 3->2->1->4->5
 * <p>
 * Note:
 * <p>
 * Only constant extra memory is allowed.
 * You may not alter the values in the list's nodes, only nodes itself may be changed.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-nodes-in-k-group
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution2 {
    public ListNode reverseKGroup(ListNode head, int k) {
        // before recursive method: how to move? and on which condition should return?

        if (head == null) return head;

        ListNode tail = head; // move to the Kth node
        for (int i = 1; i < k; i++) {
            if (tail != null) {
                tail = tail.next;
            }
        }

        if (tail == null) { // if don't have enough node, don't reverse, so return first node in k group.
            return head;
        }

        // recursive method
        ListNode nextKGroupHead = reverseKGroup(tail.next, k);

        // after recursive method: when recursive, what's the real logic(unit work) need to do? let node list: tail -> ... -> head -> null
        reverse(head, tail);

        // head will become tail and point to next k group's head node.
        head.next = nextKGroupHead;

        return tail;
    }

    // the result will be: tail -> ... -> head -> null
    public void reverse(ListNode head, ListNode tail) {
        ListNode k = tail.next; // reserve the succeed node of the tail node.
        ListNode curNode = head, next, pre = null;
        while (curNode != k) {
            next = curNode.next;
            curNode.next = pre;
            pre = curNode;
            curNode = next;
        }
    }
}
