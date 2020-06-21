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
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode preGroupTail = dummyHead, curGroupHead = head, nextGroupHead;

        while (curGroupHead != null) {

            ListNode end = curGroupHead;
            for (int i = 1; i < k && end != null; i++) end = end.next;
            if (end == null) return dummyHead.next;

            nextGroupHead = end.next;

            end.next = null;
            ListNode curGroupRealHead = reverse(curGroupHead);

            curGroupHead.next = nextGroupHead;
            preGroupTail.next = curGroupRealHead;

            // maintain loop variable
            preGroupTail = curGroupHead;
            curGroupHead = curGroupHead.next;
        }

        return dummyHead.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null, cur = head, succ;
        while (cur != null) {
            succ = cur.next;

            cur.next = pre;
            pre = cur;
            cur = succ;
        }

        return pre;
    }
}
