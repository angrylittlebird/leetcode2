package com.learning._147;

import com.learning.ListNode;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2020/6/23
 * @Description:
 */
public class SolutionTest {

    @Test
    public void insertionSortList() {
        Solution solution = new Solution();
        ListNode node = new ListNode(Arrays.asList(4,2,1,3));
        ListNode node1 = solution.insertionSortList(node);
        node1.print();

        node = new ListNode(Arrays.asList(-1, 5, 3, 4, 0));
        ListNode node2 = solution.insertionSortList(node);
        node2.print();
    }
}