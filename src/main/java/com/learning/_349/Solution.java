package com.learning._349;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: ZHANG
 * @Date: 2020/5/8
 * @Description: Given two arrays, write a function to compute their intersection.
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Note:
 * <p>
 * Each element in the result must be unique.
 * The result can be in any order.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                res.add(num);
            }
        }

        int[] ints = new int[res.size()];
        int i = 0;
        for (Integer re : res) {
            ints[i++] = re;
        }

        return ints;
    }
}
