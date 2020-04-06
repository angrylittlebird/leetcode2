package com.learning._215;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author: ZHANG
 * @Date: 2020/4/6
 * @Description:
 */
public class SolutionTest {

    @Test
    public void findKthLargest() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        Solution solution = new Solution();
        int kthLargest = solution.findKthLargest(nums, 4);
        assertEquals(4, kthLargest);

        nums = new int[]{3, 2, 1, 5, 6, 4};
        int kthLargest1 = solution.findKthLargest(nums, 2);
        assertEquals(5, kthLargest1);
    }
}