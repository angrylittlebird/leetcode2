package com.learning._88;

/**
 * @Author: ZHANG
 * @Date: 2020/3/31
 * @Description: Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * <p>
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 * <p>
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * Output: [1,2,2,3,5,6]
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // i,j 分别指向数组nums1和nums2当前检查的元素，k为在nums3中应插入的位置
        int i = 0, j = 0, k = 0;

        int[] nums3 = new int[m + n];

        while (i < m || j < n) {
            if(i == m) {
                nums3[k++] = nums2[j++];
                continue;
            }

            if(j == n) {
                nums3[k++] = nums1[i++];
                continue;
            }

            if (nums1[i] <= nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }

        for (int l = 0; l < nums3.length; l++) {
            nums1[l] = nums3[l];
        }
    }
}
