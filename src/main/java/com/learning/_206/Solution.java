package com.learning._206;

/**
 * @Author: ZHANG
 * @Date: 2020/5/22
 * @Description: Reverse a singly linked list.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 * <p>
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * class ListNode {
 * int val;
 * ListNode next;
 * <p>
 * ListNode(int x) {
 * val = x;
 * }
 * }
 */


public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null, cur = head, succeed;
        while (cur != null) {
            succeed = cur.next;
            cur.next = pre;
            pre = cur;
            cur = succeed;
        }

        return pre;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
