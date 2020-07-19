package com.learning._234;

import com.learning.ListNode;

/**
 * @Author: ZHANG
 * @Date: 2020/7/14
 * @Description: 翻转前半部分的链表
 * 当链表为奇数个时，如果前半部分的的链表个数大于后半部分的链表个数，需要做特殊处理
 */
public class Solution3 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        ListNode fast = head, slow = head, pre = head, prepre = null;
        while (fast != null && fast.next != null) {
            pre = slow;

            slow = slow.next;
            fast = fast.next.next;

            //revert
            pre.next = prepre;
            prepre = pre;
        }

        if (fast != null) slow = slow.next;

        return compare(slow, pre);
    }

    private boolean compare(ListNode head, ListNode newHead) {
        while (head != null && newHead != null) {
            if (head.val != newHead.val) return false;
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }
}
