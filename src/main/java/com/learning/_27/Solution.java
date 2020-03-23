package com.learning._27;

/**
 * @Author: ZHANG
 * @Date: 2020/3/23
 * @Description:
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        //[0,k) 之间都是值为不等于val的元素
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
