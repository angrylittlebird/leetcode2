package com.learning._167;

import org.junit.Test;

import static java.util.Arrays.binarySearch;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * @Author: ZHANG
 * @Date: 2020/4/12
 * @Description:
 */
public class SolutionTest {

    @Test
    public void binarySearchTest() {
        int[] numbers = {2, 7, 11, 15};
        int i = binarySearch(numbers, 1, numbers.length, 16);
        assertEquals(-5, i);

        i = binarySearch(numbers, 0, numbers.length, 1);
        assertEquals(-1, i);

        i = binarySearch(numbers, 1, numbers.length, 11);
        assertEquals(2, i);
    }

    @Test
    public void twoSum() {
        Solution solution = new Solution();
        int[] ints = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{1, 2}, ints);
    }
}