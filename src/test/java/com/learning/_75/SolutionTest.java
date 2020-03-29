package com.learning._75;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @Author: ZHANG
 * @Date: 2020/3/29
 * @Description:
 */
public class SolutionTest {

    @Test
    public void sortColors() {
        Solution solution = new Solution();
        int nums[] = new int[]{2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}