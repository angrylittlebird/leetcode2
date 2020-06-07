package com.learning._83;

import com.learning.ListNode;

/**
 * @Author: ZHANG
 * @Date: 2020/6/7
 * @Description: Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->1->2
 * Output: 1->2
 * Example 2:
 * <p>
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution2 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        deleteDuplicates(head.next);
        if (head.val == head.next.val) {
            head.next = head.next.next;
        }
        return head;
    }
}
