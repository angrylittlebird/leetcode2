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
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head, succ;
        while (cur != null && cur.next != null) {
            succ = cur.next;
            if (cur.val == succ.val) {
                cur.next = succ.next;
                succ.next = null;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
