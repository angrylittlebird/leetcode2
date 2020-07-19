package com.learning._234;

import com.learning.ListNode;

/**
 * @Author: ZHANG
 * @Date: 2020/7/14
 * @Description:
 */
public class Solution2 {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        slow.next = null;

        ListNode newHead = revert(mid);

        return compare(head, newHead);
    }

    private boolean compare(ListNode head, ListNode newHead) {
        while (head != null && newHead != null) {
            if(head.val != newHead.val) return false;
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }

    private ListNode revert(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode tail = revert(head.next);
        head.next.next = head;
        head.next = null;

        return tail;
    }

}
