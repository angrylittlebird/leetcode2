package com.learning._143;

import com.learning.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2020/7/9
 * @Description: Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 * <p>
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 * <p>
 * Example 1:
 * <p>
 * Given 1->2->3->4, reorder it to 1->4->2->3.
 * Example 2:
 * <p>
 * Given 1->2->3->4->5, reorder it to 1->5->2->4->3.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reorder-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution2 {
    public void reorderList(ListNode head) {
        if(head == null) return;
        List<ListNode> nodeInList = populateInList(head);
        int size = nodeInList.size();
        int p = 0, q = size - 1;
        ListNode curTail,curHead;
        while (p < q) {
            curHead = nodeInList.get(p++);
            curTail = nodeInList.get(q--);
            curHead.next = curTail;
            curTail.next = nodeInList.get(p);
        }
        nodeInList.get(p).next = null;
    }

    private List<ListNode> populateInList(ListNode head) {
        ListNode curNode = head;
        ArrayList<ListNode> listNodes = new ArrayList<>();
        while (curNode != null) {
            listNodes.add(curNode);
            curNode = curNode.next;
        }
        return listNodes;
    }
}
