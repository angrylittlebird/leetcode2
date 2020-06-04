package com.learning._206;

import com.learning.ListNode;
import org.junit.Test;

/**
 * @Author: ZHANG
 * @Date: 2020/6/4
 * @Description:
 */
public class Solution2Test {

    @Test
    public void reverseList() {
        Solution2 solution = new Solution2();
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