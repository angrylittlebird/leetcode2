package com.learning._21;

import com.learning.ListNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2020/6/14
 * @Description:
 */
public class SolutionTest {

    @Test
    public void mergeTwoLists() {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(Arrays.asList(1, 2, 4));
        ListNode l2 = new ListNode(Arrays.asList(1, 3, 4));
        ListNode listNode = solution.mergeTwoLists(l1, l2);
        listNode.print();
        boolean compare = listNode.compare(Arrays.asList(1, 1, 2, 3, 4, 4));
        Assert.assertTrue(compare);
    }
}