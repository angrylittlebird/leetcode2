package com.learning;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2020/6/6
 * @Description:
 */
public class ListNodeTest {

    @Test
    public void createListNode() {
        ListNode listNode = ListNode.createListNode(Arrays.asList(1, 2, 3));
        listNode.print();
    }

    @Test
    public void print() {
        ListNode listNode = new ListNode(Arrays.asList(1, 2, 3));
        listNode.print();
        listNode.print();
    }

    @Test
    public void compare() {
        ListNode listNode = new ListNode(Arrays.asList(1, 2, 3));
        boolean compare = listNode.compare(Arrays.asList(1, 2, 3));
        Assert.assertTrue(compare);

        compare = listNode.compare(Arrays.asList(1, 3, 3));
        Assert.assertFalse(compare);

        compare = listNode.compare(Arrays.asList(1, 2, 3, 4));
        Assert.assertFalse(compare);

        compare = listNode.compare(Arrays.asList(1, 2));
        Assert.assertFalse(compare);
    }

    @Test
    public void cloneTest() {
        ListNode listNode = new ListNode(Arrays.asList(1, 2, 3));
        ListNode listNode1 = listNode.cloneMyself();
        while (listNode != null) {
            assert listNode != listNode1;
            listNode = listNode.next;
            listNode1 = listNode1.next;
        }
    }
}