package com.learning._148;

import com.learning.ListNode;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2020/7/5
 * @Description:
 */
public class SolutionTest {

    @Test
    public void sortList() {
        Solution solution = new Solution();
        ListNode node = new ListNode(Arrays.asList(4, 2, 1, 3));
        ListNode node2 = solution.sortList(node);
        node2.print();
        node = new ListNode(Arrays.asList(-1,5,3,4,0));
        node2 = solution.sortList(node);
        node2.print();
    }
}