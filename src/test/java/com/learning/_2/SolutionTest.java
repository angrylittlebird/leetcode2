package com.learning._2;

import com.learning.ListNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2020/6/13
 * @Description:
 */
public class SolutionTest {

    @Test
    public void addTwoNumbers() {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(Arrays.asList(2, 4, 3));
        ListNode listNode2 = new ListNode(Arrays.asList(5, 6, 4));

        ListNode listNode3 = solution.addTwoNumbers(listNode, listNode2);
        boolean compare = listNode3.compare(Arrays.asList(7, 0, 8));
        Assert.assertTrue(compare);

        listNode3 = solution.addTwoNumbers(listNode, null);
        compare = listNode3.compare(Arrays.asList(2, 4, 3));
        Assert.assertTrue(compare);

        ListNode l4 = new ListNode(Arrays.asList(9, 5, 6));
        listNode3 = solution.addTwoNumbers(listNode, l4);
        listNode3.print();
        compare = listNode3.compare(Arrays.asList(1, 0, 0, 1));
        Assert.assertTrue(compare);
    }
}