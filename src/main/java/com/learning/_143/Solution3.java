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
public class Solution3 {
    public void reorderList(ListNode head) {
        if (head == null) return;
        ListNode tail = getFirstTail(head);
        ListNode secondHead = tail.next;
        tail.next = null;

        ListNode reverseHead = reverseList(secondHead);

//        while (head != null) {
//            ListNode nextHead = head.next;
//            head.next = reverseHead;
//            head = nextHead;
//
//            if (reverseHead != null) {
//                ListNode nextReverseHead = reverseHead.next;
//                reverseHead.next = nextHead;
//                reverseHead = nextReverseHead;
//            }
//        }

        // the number of first list node is great or equal to the second list node
        // so we just need to check the reverseHead is or not null.
        while (reverseHead != null) {
            ListNode temp = reverseHead.next;
            reverseHead.next = head.next;
            head.next = reverseHead;
            head = reverseHead.next;
            reverseHead = temp;
        }


    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode tail = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return tail;
    }

    // if the number of list is even, return tail of the first list(head.length == 4, return 2th node, index start from 1th)
    // if the number of list is odd, (head.length == 5, return 2th node)
    private ListNode getFirstTail(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
