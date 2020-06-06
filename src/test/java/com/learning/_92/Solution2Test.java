package com.learning._92;

import com.learning.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2020/6/6
 * @Description:
 */
public class Solution2Test {
    ListNode node;
    List<Integer> list;

    @Before
    public void create() {
        list = Arrays.asList(1, 2, 3, 4);
        node = new ListNode(list);
    }

    @Test
    public void reverseBetween() {
        Solution2 solution = new Solution2();

        ListNode listNode = node.cloneMyself();
        ListNode listNode1 = solution.reverseBetween(listNode, 2, 3);
        boolean compare = listNode1.compare(Arrays.asList(1, 3, 2, 4));
        Assert.assertTrue(compare);

        listNode = node.cloneMyself();
        listNode1 = solution.reverseBetween(listNode, 1, 4);
        listNode1.print();
        compare = listNode1.compare(Arrays.asList(4, 3, 2, 1));
        Assert.assertTrue(compare);

        listNode = node.cloneMyself();
        listNode1 = solution.reverseBetween(listNode, 1, 1);
        compare = listNode1.compare(list);
        Assert.assertTrue(compare);

        listNode = node.cloneMyself();
        listNode1 = solution.reverseBetween(listNode, 4, 4);
        compare = listNode1.compare(list);
        listNode1.print();
        Assert.assertTrue(compare);

        listNode = new ListNode(Arrays.asList(4));
        listNode1 = solution.reverseBetween(listNode, 1, 1);
        compare = listNode1.compare(Arrays.asList(4));
        Assert.assertTrue(compare);

        listNode = node.cloneMyself();
        listNode1 = solution.reverseBetween(listNode, 1, 2);
        compare = listNode1.compare(Arrays.asList(1, 2, 3, 4));
        Assert.assertFalse(compare);
    }
}