package com.learning._345;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: ZHANG
 * @Date: 2020/4/18
 * @Description:
 */
public class SolutionTest {

    @Test
    public void reverseVowels() {
        Solution solution = new Solution();
        String s = solution.reverseVowels("aeiou");
        assertEquals("uoiea", s);

        s = solution.reverseVowels("");
        assertEquals("",s);

        s = solution.reverseVowels("a");
        assertEquals("a", s);

        s = solution.reverseVowels("ab");
        assertEquals("ab", s);

        s = solution.reverseVowels("hello");
        assertEquals("holle", s);

        s = solution.reverseVowels("bcd");
        assertEquals("bcd", s);
    }
}