package com.learning._203;

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
    public void removeElements() {
        Solution solution = new Solution();
        ListNode listNode = solution.removeElements(new ListNode(Arrays.asList(1, 2, 6, 3, 4, 5, 6)), 6);
        boolean compare = listNode.compare(Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertTrue(compare);

        listNode = solution.removeElements(new ListNode(Arrays.asList(1, 6, 6, 3, 4, 5, 6)), 6);
        compare = listNode.compare(Arrays.asList(1, 3, 4, 5));
        Assert.assertTrue(compare);

        listNode = solution.removeElements(null, 6);
        Assert.assertNull(listNode);
    }
}