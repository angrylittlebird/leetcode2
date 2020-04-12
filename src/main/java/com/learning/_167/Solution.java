package com.learning._167;

import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2020/4/12
 * @Description: Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * <p>
 * Note:
 * <p>
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Example:
 * <p>
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 * <p>
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int targetIndex = Arrays.binarySearch(numbers, i + 1, numbers.length, target - numbers[i]);
            if (targetIndex > i && targetIndex < numbers.length) {
                return new int[]{i+1, targetIndex+1};
            }
        }
        return new int[]{};
    }

}
