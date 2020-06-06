package com.learning._92;

import com.learning.ListNode;

/**
 * @Author: ZHANG
 * @Date: 2020/5/22
 * @Description: Reverse a linked list from position m to n. Do it in one-pass.
 * <p>
 * Note: 1 ≤ m ≤ n ≤ length of list.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->3->4->5->NULL, m = 2, n = 4
 * Output: 1->4->3->2->5->NULL
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    ListNode succ = null;

    // reverse head list between[m,n], the first index is 1. Return the first node after reversing.
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // when m is 1, meaning that reverse the first n nodes.
        if (m == 1) {
            return reverse(head, n);
        }

        //go to the node m. if m == 2, then we need go once; and n == 3, then we need reverse 2 nodes, right?
        // think about what will return? so that which node to be assigned.
        head.next = reverseBetween(head.next, m - 1, n - 1);


        return head;
    }

    //reverse the first n nodes, return the head node after reversing(node n).
    public ListNode reverse(ListNode head, int n) {
        //when at node n, or you can think of the node list only have one node.
        if (n == 1) {
            succ = head.next;
            return head;
        }

        //go to the node n.
        ListNode lastNode = reverse(head.next, n - 1);

        head.next.next = head;
        head.next = succ; //It's a null, before succ had been assigned a value.

        return lastNode;
    }
}
