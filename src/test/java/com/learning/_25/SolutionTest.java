package com.learning._25;

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
    public void reverseKGroup() {
        Solution solution = new Solution();
        ListNode node = solution.reverseKGroup(new ListNode(Arrays.asList(1, 2, 3, 4, 5, 6)), 2);
        boolean compare = node.compare(Arrays.asList(2, 1, 4, 3, 6, 5));
        Assert.assertTrue(compare);

        node = solution.reverseKGroup(new ListNode(Arrays.asList(1, 2, 3, 4, 5)), 2);
        compare = node.compare(Arrays.asList(2, 1, 4, 3, 5));
        Assert.assertTrue(compare);
    }
}