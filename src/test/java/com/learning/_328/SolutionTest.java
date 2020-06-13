package com.learning._328;

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
    public void oddEvenList() {
        ListNode listNode = new ListNode(Arrays.asList(1, 2, 3));

        Solution solution = new Solution();
        ListNode oddEvenList = solution.oddEvenList(listNode);
        boolean compare = oddEvenList.compare(Arrays.asList(1, 3, 2));
        Assert.assertTrue(compare);

        oddEvenList = solution.oddEvenList(null);
        Assert.assertNull(oddEvenList);

        listNode = new ListNode(Arrays.asList(2, 3, 4, 1, 2, 2));
        oddEvenList = solution.oddEvenList(listNode);
        oddEvenList.print();
        compare = oddEvenList.compare(Arrays.asList(2, 4, 2, 3, 1, 2));
        Assert.assertTrue(compare);
    }
}