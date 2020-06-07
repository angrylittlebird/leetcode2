package com.learning._83;

import com.learning.ListNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2020/6/7
 * @Description:
 */
public class Solution2Test {

    @Test
    public void deleteDuplicates() {
        Solution2 solution = new Solution2();
        ListNode listNode = new ListNode(Arrays.asList(1, 2, 2, 3));
        ListNode deleteDuplicates = solution.deleteDuplicates(listNode);
        boolean compare = deleteDuplicates.compare(Arrays.asList(1, 2, 3));
        Assert.assertTrue(compare);

        listNode = new ListNode(Arrays.asList(1, 2, 2, 3, 3));
        deleteDuplicates = solution.deleteDuplicates(listNode);
        compare = deleteDuplicates.compare(Arrays.asList(1, 2, 3));
        Assert.assertTrue(compare);

        listNode = new ListNode(Arrays.asList(1));
        deleteDuplicates = solution.deleteDuplicates(listNode);
        compare = deleteDuplicates.compare(Arrays.asList(1));
        Assert.assertTrue(compare);

        deleteDuplicates = solution.deleteDuplicates(null);
        Assert.assertNull(deleteDuplicates);
    }
}