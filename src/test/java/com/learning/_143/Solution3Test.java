package com.learning._143;

import com.learning.ListNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2020/7/11
 * @Description:
 */
public class Solution3Test {

    @Test
    public void reverseList() {
        Solution3 solution = new Solution3();
        ListNode node1 = new ListNode(Arrays.asList(1, 2, 3));
        ListNode node2 = solution.reverseList(node1);
        boolean compare = node2.compare(Arrays.asList(3, 2, 1));
        Assert.assertTrue(compare);

        node1 = new ListNode(Arrays.asList(1, 2, 3, 4));
        node2 = solution.reverseList(node1);
        compare = node2.compare(Arrays.asList(4, 3, 2, 1));
        Assert.assertTrue(compare);

        node2 = solution.reverseList(null);
        Assert.assertNull(node2);
    }

    @Test
    public void reorderList() {
        Solution3 solution = new Solution3();
        ListNode node1 = new ListNode(Arrays.asList(1, 2, 3));
        solution.reorderList(node1);
        node1.print();
        boolean compare = node1.compare(Arrays.asList(1, 3, 2));
        Assert.assertTrue(compare);

        node1 = new ListNode(Arrays.asList(1, 2, 3, 4));
        solution.reorderList(node1);
        compare = node1.compare(Arrays.asList(1, 4, 2, 3));
        Assert.assertTrue(compare);
    }
}