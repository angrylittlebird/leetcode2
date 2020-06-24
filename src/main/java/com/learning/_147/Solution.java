package com.learning._147;

import com.learning.ListNode;

/**
 * @Author: ZHANG
 * @Date: 2020/6/23
 * @Description: Sort a linked list using insertion sort.
 * A graphical example of insertion sort. The partial sorted list (black) initially contains only the first element in the list.
 * With each iteration one element (red) is removed from the input data and inserted in-place into the sorted list
 * <p>
 * Algorithm of Insertion Sort:
 * <p>
 * Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
 * At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there.
 * It repeats until no input elements remain.
 * <p>
 * Example 1:
 * <p>
 * Input: 4->2->1->3
 * Output: 1->2->3->4
 * Example 2:
 * <p>
 * Input: -1->5->3->4->0
 * Output: -1->0->3->4->5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/insertion-sort-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null)return head;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead, cur = head, lastBlack = cur, red, nextRed;
        while (lastBlack.next != null) {
            red = lastBlack.next;
            nextRed = red.next;

            if (red.val > cur.val) {
                pre = cur;
                cur = cur.next;
            } else if (red == cur) {
                lastBlack = lastBlack.next;

                pre = dummyHead;
                cur = pre.next;
            } else {
                pre.next = red;
                red.next = cur;
                lastBlack.next = nextRed;

                pre = dummyHead;
                cur = pre.next;
            }
        }
        return dummyHead.next;
    }
}
