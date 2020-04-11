package com.learning._215;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * @Author: ZHANG
 * @Date: 2020/4/9
 * @Description:
 */
public class Solution3Test {
    @Test
    public void shiftDown() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Solution3 solution3 = new Solution3();

        Method shiftDown = solution3.getClass().getDeclaredMethod("shiftDown", int.class, int[].class);
        shiftDown.setAccessible(true);

        int[] nums = new int[]{4, 5};
        shiftDown.invoke(solution3, 0, nums);
        assertArrayEquals(new int[]{4, 5}, nums);

        nums = new int[]{5, 4};
        shiftDown.invoke(solution3, 0, nums);
        assertArrayEquals(new int[]{4, 5}, nums);

        nums = new int[]{5, 8, 4};
        shiftDown.invoke(solution3, 0, nums);
        assertArrayEquals(new int[]{4, 8, 5}, nums);

        nums = new int[]{5, 4, 8};
        shiftDown.invoke(solution3, 0, nums);
        assertArrayEquals(new int[]{4, 5, 8}, nums);

        nums = new int[]{5, 4, 3};
        shiftDown.invoke(solution3, 0, nums);
        assertArrayEquals(new int[]{3, 4, 5}, nums);

        nums = new int[]{5, 3, 4};
        shiftDown.invoke(solution3, 0, nums);
        assertArrayEquals(new int[]{3, 5, 4}, nums);

        nums = new int[]{6, 3, 4, 5};//3,6,4,5=>3,5,4,6
        shiftDown.invoke(solution3, 0, nums);
        assertArrayEquals(new int[]{3, 5, 4, 6}, nums);

        nums = new int[]{7, 3, 4, 6, 5};//3, 7, 4, 6, 5=>3, 5, 4, 6, 7
        shiftDown.invoke(solution3, 0, nums);
        assertArrayEquals(new int[]{3, 5, 4, 6, 7}, nums);
    }

    @Test
    public void findKthLargest() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        Solution3 solution = new Solution3();
        int kthLargest = solution.findKthLargest(nums, 4);
        assertEquals(4, kthLargest);

        nums = new int[]{3, 2, 1, 5, 6, 4};
        int kthLargest1 = solution.findKthLargest(nums, 2);
        assertEquals(5, kthLargest1);


        nums = new int[]{2, 1};
        int kthLargest2 = solution.findKthLargest(nums, 2);
        assertEquals(1, kthLargest2);

        nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6, 7, 7, 8, 2, 3, 1, 1, 1, 10, 11, 5, 6, 2, 4, 7, 8, 5, 6};
        int kthLargest3 = solution.findKthLargest(nums, 20);
        assertEquals(2, kthLargest3);
    }

    @Test
    public void heapify() {
        int[] nums = new int[]{3};
        Solution3 solution = new Solution3();
        solution.heapify(nums);
        assertArrayEquals(new int[]{3}, nums);


        nums = new int[]{2, 3};
        solution = new Solution3();
        solution.heapify(nums);
        assertArrayEquals(new int[]{2, 3}, nums);

        nums = new int[]{3, 2};
        solution = new Solution3();
        solution.heapify(nums);
        assertArrayEquals(new int[]{2, 3}, nums);

        nums = new int[]{3, 1, 2};
        solution = new Solution3();
        solution.heapify(nums);
        assertArrayEquals(new int[]{1, 3, 2}, nums);

        nums = new int[]{3, 2, 1};
        solution = new Solution3();
        solution.heapify(nums);
        assertArrayEquals(new int[]{1, 2, 3}, nums);

        nums = new int[]{3, 4, 1};
        solution = new Solution3();
        solution.heapify(nums);
        assertArrayEquals(new int[]{1, 4, 3}, nums);

        nums = new int[]{3, 1, 4};
        solution = new Solution3();
        solution.heapify(nums);
        assertArrayEquals(new int[]{1, 3, 4}, nums);

        nums = new int[]{7, 3, 4, 6, 5};
        solution = new Solution3();
        solution.heapify(nums);
        assertArrayEquals(new int[]{3, 5, 4, 6, 7}, nums);

    }
}