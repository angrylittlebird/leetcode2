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
public class SolutionTest {
    ListNode node;
    List<Integer> list;

    @Before
    public void create() {
        list = Arrays.asList(1, 2, 3, 4);
        node = new ListNode(list);
    }

    @Test
    public void reverse() {
        Solution solution = new Solution();
        ListNode listNode = node.cloneMyself();
        ListNode reverse = solution.reverse(listNode, 4);
        boolean compare = reverse.compare(Arrays.asList(4, 3, 2, 1));
        Assert.assertTrue(compare);

        ListNode listNode1 = node.cloneMyself();
        ListNode reverse1 = solution.reverse(listNode1, 1);
        compare = reverse1.compare(Arrays.asList(1, 2, 3, 4));
        Assert.assertTrue(compare);
    }

    @Test
    public void reverseBetween() {
        Solution solution = new Solution();

        ListNode listNode = node.cloneMyself();
        ListNode listNode1 = solution.reverseBetween(listNode, 2, 3);
        boolean compare = listNode1.compare(Arrays.asList(1, 3, 2, 4));
        Assert.assertTrue(compare);

        listNode = node.cloneMyself();
        listNode1 = solution.reverseBetween(listNode, 1, 4);
        compare = listNode1.compare(Arrays.asList(4, 3, 2, 1));
        Assert.assertTrue(compare);

        listNode = node.cloneMyself();
        listNode1 = solution.reverseBetween(listNode, 1, 1);
        compare = listNode1.compare(list);
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