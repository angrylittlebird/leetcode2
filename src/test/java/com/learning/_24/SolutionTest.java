package com.learning._24;

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
    public void swapPairs() {
        Solution solution = new Solution();
        ListNode node = solution.swapPairs(new ListNode(Arrays.asList(1, 2, 3, 4)));
        boolean compare = node.compare(Arrays.asList(2, 1, 4, 3));
        Assert.assertTrue(compare);

        node = solution.swapPairs(new ListNode(Arrays.asList(1, 2, 3)));
        compare = node.compare(Arrays.asList(2, 1, 3));
        Assert.assertTrue(compare);

        node = solution.swapPairs(null);
        Assert.assertNull(node);

    }
}