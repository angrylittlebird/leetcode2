package com.learning._75;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2020/3/29
 * @Description:
 */
public class Solution2Test {

    @Test
    public void sortColors() {
        Solution2 solution = new Solution2();
        int nums[] = new int[]{2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void sortColors2() {
        Solution2 solution = new Solution2();
        int nums[] = new int[]{2, 0, 2, 1, 1, 0};
        solution.sortColors2(nums);
        System.out.println(Arrays.toString(nums));
    }
}