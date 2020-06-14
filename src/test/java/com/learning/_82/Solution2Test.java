package com.learning._82;

import com.learning.ListNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2020/6/14
 * @Description:
 */
public class Solution2Test {

    @Test
    public void deleteDuplicates() {
        Solution2 solution = new Solution2();
        ListNode listNode = solution.deleteDuplicates(new ListNode(Arrays.asList(1, 2, 3, 3, 4, 4, 5)));
        listNode.print();
        boolean compare = listNode.compare(Arrays.asList(1, 2, 5));
        Assert.assertTrue(compare);

        listNode = solution.deleteDuplicates(new ListNode(Arrays.asList(1, 1, 1, 2, 3)));
        listNode.print();
        compare = listNode.compare(Arrays.asList(2, 3));
        Assert.assertTrue(compare);
    }
}