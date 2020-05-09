package com.learning._350;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: ZHANG
 * @Date: 2020/5/8
 * @Description: Given two arrays, write a function to compute their intersection.
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Note:
 * <p>
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 * <p>
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] res;
        if (nums1.length < nums2.length) {
            res = set_intersect(nums1, nums2);
        } else {
            res = set_intersect(nums2, nums1);
        }
        return res;
    }

    private int[] set_intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int num : nums1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (freq.containsKey(num) && freq.get(num) > 0) {
                res.add(num);
                freq.put(num, freq.get(num) - 1);
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
