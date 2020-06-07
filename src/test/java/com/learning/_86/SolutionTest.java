package com.learning._86;

import com.learning.ListNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2020/6/7
 * @Description:
 */
public class SolutionTest {

    @Test
    public void partition() {
        ListNode listNode = new ListNode(Arrays.asList(1, 3, 4, 1, 2, 2));

        Solution solution = new Solution();
        ListNode partition = solution.partition(listNode, 2);
        partition.print();

        partition = solution.partition(null, 2);
        Assert.assertNull(partition);
    }
}