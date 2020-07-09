package com.learning._143;

import com.learning.ListNode;

/**
 * @Author: ZHANG
 * @Date: 2020/7/9
 * @Description: Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 * <p>
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 * <p>
 * Example 1:
 * <p>
 * Given 1->2->3->4, reorder it to 1->4->2->3.
 * Example 2:
 * <p>
 * Given 1->2->3->4->5, reorder it to 1->5->2->4->3.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reorder-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public void reorderList(ListNode head) {
        int nodeCount = count(head);
        if (nodeCount <= 2) return;

        reorderListHelper(head, nodeCount);
    }

    // return next tail node
    private ListNode reorderListHelper(ListNode head, int nodeCount) {
        if (nodeCount == 1) {
            ListNode tail = head.next;
            head.next = null;
            return tail;
        }

        if (nodeCount == 2) {
            ListNode tail = head.next.next;
            head.next.next = null;
            return tail;
        }

        ListNode curTail = reorderListHelper(head.next, nodeCount - 2);
        ListNode nextTail = curTail.next;
        ListNode preHead = head.next;

        head.next = curTail;
        curTail.next = preHead;

        return nextTail;
    }

    private int count(ListNode head) {
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
}
