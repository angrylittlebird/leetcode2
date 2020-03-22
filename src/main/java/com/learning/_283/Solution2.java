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
public class Solution2 {
    public void moveZeroes(int[] nums) {
        // 当前第一个值为0的索引
//        int oIndex = 0;
//        while (oIndex < nums.length && nums[oIndex] != 0) oIndex++;

        // 当前第一个值不为0的索引
//        int notOIndex = oIndex + 1;
//        while (notOIndex < nums.length && nums[notOIndex] == 0) notOIndex++;

        //这里费劲的去寻找第一个值不为0的索引，然后把值赋给第一个值为0的索引，属实很浪费时间。

        //定义区间[0,k)为非零的元素，检查当前索引i值是否为0，如果不是就赋给索引k，k++,i++；如果是则i++；
        //这和上面最大的不同是，即使当指针i指向的值不为0时也会将值赋给指针k，只不过k的值未发生变化而已，
        //好处是可以少写上面寻找第一个为0的索引和之后第一个非0的索引（即oIndex,notOIndex的初始化代码），以及很好的将之后的赋值操作融合在了一起

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }

    }
}
