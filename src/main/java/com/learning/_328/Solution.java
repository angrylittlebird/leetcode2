package com.learning._328;

import com.learning.ListNode;

/**
 * @Author: ZHANG
 * @Date: 2020/6/7
 * @Description: Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
 * <p>
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->2->3->4->5->NULL
 * Output: 1->3->5->2->4->NULL
 * Example 2:
 * <p>
 * Input: 2->1->3->5->6->4->7->NULL
 * Output: 2->3->6->7->1->5->4->NULL
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/odd-even-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {

        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode curOdd = odd, curEven = even;

        while (head != null) {
            curOdd.next = head;
            curOdd = curOdd.next;
            head = head.next;
            if (head != null) {
                curEven.next = head;
                curEven = curEven.next;
                head = head.next;
            } else { // if last node is odd, need to set the last second node's next point to null; don't need to worry, if the last node is even.
                curEven.next = null;
            }
        }

        // here is the reason that we don't need to worry.
        curOdd.next = even.next;

        return odd.next;
    }
}
