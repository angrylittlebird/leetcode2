package com.learning._148;

import com.learning.ListNode;

/**
 * @Author: ZHANG
 * @Date: 2020/7/5
 * @Description: Sort a linked list in O(n log n) time using constant space complexity.
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
 * 链接：https://leetcode-cn.com/problems/sort-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        for (int i = 1; ; i *= 2) {
            ListNode theOtherHead = moveCountNode(dummyHead.next, i);
            if (theOtherHead == null) break;
            ListNode nextGroupHead;
            ListNode preHead = dummyHead;

            while (theOtherHead != null) {
                nextGroupHead = moveCountNode(theOtherHead, i);
                ListNode tail = mergeSortedList(preHead, theOtherHead, nextGroupHead);
                tail.next = nextGroupHead;
                preHead = tail;
                theOtherHead = moveCountNode(nextGroupHead, i);
            }
        }

        return dummyHead.next;
    }

    /**
     * @param node  current head node
     * @param count move current head count times
     * @return current node after moving count times
     */
    private ListNode moveCountNode(ListNode node, int count) {
        ListNode curNode = node;
        while (curNode != null && count != 0) {
            curNode = curNode.next;
            count--;
        }
        return curNode;
    }

    private ListNode mergeSortedList(ListNode preHead, ListNode theOtherHead, ListNode nextGroupHead) {
        ListNode curHead = preHead.next;
        ListNode theOtherHeadCopy = theOtherHead;
        while (curHead != theOtherHeadCopy || theOtherHead != nextGroupHead) {
            if (curHead == theOtherHeadCopy) {
                preHead.next = theOtherHead;
                theOtherHead = theOtherHead.next;
                preHead = preHead.next;
                continue;
            }

            if (theOtherHead == nextGroupHead) {
                preHead.next = curHead;
                curHead = curHead.next;
                preHead = preHead.next;
                continue;
            }

            if (curHead.val < theOtherHead.val) {
                preHead.next = curHead;
                curHead = curHead.next;
            } else {
                preHead.next = theOtherHead;
                theOtherHead = theOtherHead.next;
            }
            preHead = preHead.next;
        }

        return preHead;
    }
}
