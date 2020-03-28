//package com.learning._80;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
///**
// * @Author: ZHANG
// * @Date: 2020/3/26
// * @Description:
// */
//public class SolutionTest {
//
//    @Test
//    public void removeDuplicates() {
//        Solution solution = new Solution();
//        int[] nums = {1, 1, 1, 2, 2, 3};
//        int i = solution.removeDuplicates(nums);
//        Assert.assertEquals(5, i);
//        for (int j = 0; j < i; j++) {
//            System.out.print(nums[j]+",");
//        }
//
//        System.out.println();
//        nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
//        i = solution.removeDuplicates(nums);
//        Assert.assertEquals(7, i);
//        for (int j = 0; j < i; j++) {
//            System.out.print(nums[j]+",");
//        }
//
//        System.out.println();
//        nums = new int[]{0};
//        i = solution.removeDuplicates(nums);
//        Assert.assertEquals(1, i);
//        for (int j = 0; j < i; j++) {
//            System.out.print(nums[j]+",");
//        }
//
//    }
//}