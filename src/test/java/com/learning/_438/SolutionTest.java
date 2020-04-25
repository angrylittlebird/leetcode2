package com.learning._438;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: ZHANG
 * @Date: 2020/4/25
 * @Description:
 */
public class SolutionTest {

    @Test
    public void findAnagrams() {
        Solution solution = new Solution();
        List<Integer> anagrams = solution.findAnagrams("cbaebabacd", "abc");
        assertArrayEquals(new Integer[]{0,6},anagrams.toArray(new Integer[2]));
    }
}