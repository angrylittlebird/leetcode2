package com.learning._23;

import com.learning.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: ZHANG
 * @Date: 2020/10/17
 * @Description:
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, Comparator.comparing(p -> p.val));
        for (ListNode node : lists) {
            if (node != null) {
                queue.offer(node);
            }
        }

        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            cur.next = node;
            cur = cur.next;
            if (node.next != null) {
                queue.add(node.next);
            }
        }

        return dummyHead.next;
    }
}
