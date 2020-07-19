package com.learning._234;

import com.learning.ListNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2020/7/14
 * @Description:
 */
public class Solution3Test {

    @Test
    public void isPalindrome() {
        ListNode node = new ListNode(Arrays.asList(1));
        Solution3 solution = new Solution3();
        boolean palindrome = solution.isPalindrome(node);
        Assert.assertTrue(palindrome);

        node = new ListNode(Arrays.asList(1, 2));
        palindrome = solution.isPalindrome(node);
        Assert.assertFalse(palindrome);

        node = new ListNode(Arrays.asList(1, 2, 1));
        palindrome = solution.isPalindrome(node);
        Assert.assertTrue(palindrome);

        node = new ListNode(Arrays.asList(1, 0, 0));
        palindrome = solution.isPalindrome(node);
        Assert.assertFalse(palindrome);

        node = new ListNode(Arrays.asList(1, 2, 2, 1));
        palindrome = solution.isPalindrome(node);
        Assert.assertTrue(palindrome);
    }
}