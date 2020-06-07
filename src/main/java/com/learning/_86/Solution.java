package com.learning._86;

import com.learning.ListNode;

/**
 * @Author: ZHANG
 * @Date: 2020/6/7
 * @Description: Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * <p>
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * <p>
 * Example:
 * <p>
 * Input: head = 1->4->3->2->5->2, x = 3
 * Output: 1->2->2->4->3->5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/partition-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(-1);
        ListNode gt = new ListNode(-1);
        ListNode curHead = head, succ, curLess = less, curGt = gt;
        // move less, gt and head
        while (curHead != null) {
            succ = curHead.next;
            if (curHead.val < x) {
                curLess.next = curHead;
                curLess = curLess.next;
            } else {
                curGt.next = curHead;
                curGt = curGt.next;
            }

            curHead.next = null;
            curHead = succ;
        }

        curLess.next = gt.next;

        return less.next;
    }
}
