//package com.learning._80;
//
///**
// * @Author: ZHANG
// * @Date: 2020/3/26
// * @Description: not completed!!!
// */
//public class Solution {
//    public int removeDuplicates(int[] nums) {
//        //[j,k] nums[j] == nums[k],长度不超过2
//        int j = 0, k = 0;
//
//        //当前索引为i的元素 是否和 nums[k]相等
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != nums[j]) {
//                nums[++k] = nums[i];
//                j = k;
//            } else if (k == j) {
//                nums[++k] = nums[i];
//            }
//        }
//
//        return k + 1;
//    }
//}
