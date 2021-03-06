package com.learning._75;

/**
 * @Author: ZHANG
 * @Date: 2020/3/29
 * @Description: 三路快排中的partition操作
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * <p>
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * <p>
 * Note: You are not suppose to use the library's sort function for this problem.
 * <p>
 * Example:
 * <p>
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Follow up:
 * <p>
 * A rather straight forward solution is a two-pass algorithm using counting sort.
 * First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
 * Could you come up with a one-pass algorithm using only constant space?
 * <p>
 */
public class Solution2 {
    // 时间复杂度O(n)
    // 空间复杂度O(1)
    // 总共遍历的数组1次

    public void sortColors(int[] nums) {
        int zero = -1; // [0,zero] 区间内都为0
        int two = nums.length; //[two,nums.length-1] 区间内都为2

        for (int i = 0; i < two; ) {
            if (nums[i] == 0) {
                swap(nums, i, zero + 1);
                i++;
                zero++;
            } else if (nums[i] == 1) {
                i++;
            } else {    //nums[i]==2
                swap(nums, i, two - 1);
                two--;
            }
        }
    }

    public void sortColors2(int[] nums) {
        int zero = 0; // [0,zero) 区间内都为0
        int two = nums.length - 1; //(two,nums.length-1] 区间内都为2

        for (int i = 0; i <= two; ) {
            if (nums[i] == 0) {
                swap(nums, i, zero);
                i++;
                zero++;
            } else if (nums[i] == 1) {
                i++;
            } else {    //nums[i]==2
                swap(nums, i, two);
                two--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
