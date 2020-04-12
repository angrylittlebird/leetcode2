package com.learning._125;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: ZHANG
 * @Date: 2020/4/12
 * @Description:
 */
public class Solution2Test {

    @Test
    public void isPalindrome() {
        Solution2 solution = new Solution2();
        boolean palindrome = solution.isPalindrome("A man, a plan, a canal: Panama");
        assertTrue(palindrome);

        palindrome = solution.isPalindrome("race a car");
        assertFalse(palindrome);

        palindrome = solution.isPalindrome("0P");
        assertFalse(palindrome);

        palindrome = solution.isPalindrome("01");
        assertFalse(palindrome);


        palindrome = solution.isPalindrome(".,");
        assertTrue(palindrome);

        palindrome = solution.isPalindrome(".");
        assertTrue(palindrome);

        palindrome = solution.isPalindrome("");
        assertTrue(palindrome);
    }
}