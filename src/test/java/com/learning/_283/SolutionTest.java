package com.learning._283;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @Author: ZHANG
 * @Date: 2020/3/22
 * @Description:
 */
public class SolutionTest {

    @Test
    public void moveZeroes() {
        int[] ints = {0, 1, 0, 3, 12};
        Solution solution = new Solution();
        solution.moveZeroes(ints);
        System.out.println(Arrays.toString(ints));

        int[] ints2 = {1};
        solution.moveZeroes(ints2);
        System.out.println(Arrays.toString(ints2));

        int[] ints3 = {0,0,1};
        solution.moveZeroes(ints3);
        System.out.println(Arrays.toString(ints3));
    }
}