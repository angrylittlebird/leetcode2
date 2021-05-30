package com.learning._300;

import org.junit.Test;

/**
 * @Author: ZHANG
 * @Date: 2021/2/22
 * @Description:
 */
public class SolutionTest {

    @Test
    public void lengthOfLIS() {
        Solution solution = new Solution();
//        int i = solution.lengthOfLIS(new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6});
        int i = solution.lengthOfLIS(new int[]{3,1});
        System.out.println(i);
    }
}