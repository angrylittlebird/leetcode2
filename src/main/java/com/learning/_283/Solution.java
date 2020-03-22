package com.learning._283;

/**
 * @Author: ZHANG
 * @Date: 2020/3/22
 * @Description: Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Example:
 * <p>
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * <p>
 * Note:
 * <p>
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        // 当前第一个值为0的索引
        int oIndex = 0;
        while (oIndex < nums.length && nums[oIndex] != 0) oIndex++;

        // oIndex之后第一个值不为0的索引
        int notOIndex = oIndex + 1;
        while (notOIndex < nums.length && nums[notOIndex] == 0) notOIndex++;

        while (notOIndex < nums.length) {
            nums[oIndex] = nums[notOIndex];
            oIndex++;
            notOIndex++;
            while (notOIndex < nums.length && nums[notOIndex] == 0) notOIndex++;
        }

        for (int i = oIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
