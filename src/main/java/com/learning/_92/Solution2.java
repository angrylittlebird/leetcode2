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
public class Solution2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // conn: node of (m-1); tail: node of m
        ListNode prev = null, cur = head, succ, conn, tail;

        // init above variables.
        while (m != 1) {
            prev = cur;
            cur = cur.next;

            m--;
            n--;
        }
        conn = prev;
        tail = cur;

        // reverse node list between [m,n];
        // if m == 2,n == 3; then how many nodes should reverse?
        while (n != 0) {
            succ = cur.next;

            cur.next = prev;
            prev = cur;
            cur = succ;

            n--;
        }

        // there are 4 scenarios:
        // 1. 1 < m <=n < length
        // 2. m == 1, n < length
        // 3. m < length, n == length
        // 4. m == 1, n == length

        // divide to 2 scenarios: does there exist a conn node to point the pre node? If not the pre should replace the head node.
        // m == 1; conn = null
        // m != 1; conn != null
        if (conn != null) {
            conn.next = prev;
        } else {
            head = prev;
        }

        // cur could be null or a successor node, both is ok.
        tail.next = cur;

        return head;
    }
}
