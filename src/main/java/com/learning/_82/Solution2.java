package com.learning._82;

import com.learning.ListNode;

/**
 * @Author: ZHANG
 * @Date: 2020/6/14
 * @Description: Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 * <p>
 * Return the linked list sorted as well.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->2->3->3->4->4->5
 * Output: 1->2->5
 * Example 2:
 * <p>
 * Input: 1->1->1->2->3
 * Output: 2->3
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution2 {
    private ListNode temp;
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode curHead = deleteDuplicates(head.next);
        if(temp == null) temp = curHead;
        if (temp.val == head.val) {
//            head.next = null;
            return temp.next;
        } else {
            head.next = curHead;
            temp = head;
            return head;
        }
    }
}
