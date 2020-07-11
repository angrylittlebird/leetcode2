package com.learning._143;

import com.learning.ListNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2020/7/10
 * @Description:
 */
public class Solution2Test {

    @Test
    public void reorderList() {
        Solution2 solution = new Solution2();
        ListNode node1 = new ListNode(Arrays.asList(1, 2, 3, 4));
        solution.reorderList(node1);
        boolean compare = node1.compare(Arrays.asList(1, 4, 2, 3));
        Assert.assertTrue(compare);

        ListNode node2 = new ListNode(Arrays.asList(1, 2, 3, 4, 5));
        solution.reorderList(node2);
        boolean compare2 = node2.compare(Arrays.asList(1, 5, 2, 4, 3));
        Assert.assertTrue(compare2);

        ListNode node3 = null;
        solution.reorderList(node3);
        Assert.assertNull(node3);
    }
}