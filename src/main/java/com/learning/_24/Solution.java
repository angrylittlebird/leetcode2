package com.learning._24;

import com.learning.ListNode;

/**
 * @Author: ZHANG
 * @Date: 2020/6/14
 * @Description: Given a linked list, swap every two adjacent nodes and return its head.
 * <p>
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 * <p>
 *  
 * <p>
 * Example:
 * <p>
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode p = dummyHead, node1 = p.next, node2, next;
        while (node1 != null) {
            node2 = node1.next;
            if (node2 != null) next = node2.next;
            else break;

            p.next = node2;
            node2.next = node1;
            node1.next = next;

            p = node1;
            node1 = p.next;
        }

        return dummyHead.next;
    }
}
