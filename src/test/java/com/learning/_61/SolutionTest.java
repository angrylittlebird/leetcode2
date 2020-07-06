package com.learning._61;

import com.learning.ListNode;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2020/7/7
 * @Description:
 */
public class SolutionTest {

    @Test
    public void rotateRight() {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(Arrays.asList(1,2,3,4,5));
        ListNode node = solution.rotateRight(listNode, 2);
        node.print();

        listNode = new ListNode(Arrays.asList(1,2,3,4,5));
        node = solution.rotateRight(listNode, 5);
        node.print();

        listNode = new ListNode(Arrays.asList(1,2,3));
        node = solution.rotateRight(listNode, 5);
        node.print();
    }
}