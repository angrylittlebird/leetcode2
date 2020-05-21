package com.learning._206;

import org.junit.Test;

/**
 * @Author: ZHANG
 * @Date: 2020/5/22
 * @Description:
 */
public class SolutionTest {

    @Test
    public void reverseList() {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        ListNode listNode1 = solution.reverseList(listNode);
        while (listNode1 != null) {
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }

        solution.reverseList(null);
    }
}