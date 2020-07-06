package com.learning._61;

import com.learning.ListNode;

/**
 * @Author: ZHANG
 * @Date: 2020/7/6
 * @Description: Given a linked list, rotate the list to the right by k places, where k is non-negative.
 * Example 1:
 * Input: 1->2->3->4->5->NULL, k = 2
 * Output: 4->5->1->2->3->NULL
 * Explanation:
 * rotate 1 steps to the right: 5->1->2->3->4->NULL
 * rotate 2 steps to the right: 4->5->1->2->3->NULL
 * <p>
 * Example 2:
 * Input: 0->1->2->NULL, k = 4
 * Output: 2->0->1->NULL
 * Explanation:
 * rotate 1 steps to the right: 2->0->1->NULL
 * rotate 2 steps to the right: 1->2->0->NULL
 * rotate 3 steps to the right: 0->1->2->NULL
 * rotate 4 steps to the right: 2->0->1->NULL
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;

        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }

        k %= count;

        ListNode p = head, q = head;
        while (q.next != null && k != 0) {
            q = q.next;
            k--;
        }

        while (q.next != null) {
            p = p.next;
            q = q.next;
        }

        q.next = head;
        head = p.next;
        p.next = null;

        return head;
    }
}
