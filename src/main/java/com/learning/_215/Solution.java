package com.learning._215;

import java.util.Objects;
import java.util.Random;

/**
 * @Author: ZHANG
 * @Date: 2020/4/5
 * @Description: Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * <p>
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4
 * Output: 4
 */

//平均时间复杂度O(N), don't know how to get this solution of time complicated.
public class Solution {
    static Random random = new Random();

    public int findKthLargest(int[] nums, int k) {
        Objects.requireNonNull(nums);
        assert (nums.length >= k);

        return partition(nums, 0, nums.length - 1, nums.length - k);
    }

    //返回[l,k]区间内经过partition操作后，索引为k的元素，实际为第 K+1 小的元素
    private int partition(int[] nums, int l, int r, int k) {
        int randomP = random.nextInt(r - l + 1) + l;
        swap(nums,l,randomP);

        int pivot = nums[l];
        int left = l, right = r + 1; //(l,left] < pivot, [right,r] >= pivot, (left,equals] == pivot;
        for (int i = left; i < right; i++) {
            if (nums[i] < pivot) {
                swap(nums, i, ++left);
            } else if (nums[i] > pivot) {
                swap(nums, i, --right);
                i--;
            }
        }
        swap(nums, l, left); //[left,equals] == nums[left]

        if (k >= left && k < right) return nums[left];

        else if (k >= right) return partition(nums, right, r, k);

        else return partition(nums, l, left - 1, k);
    }

    private void swap(int[] nums, int i, int p) {
        int temp = nums[i];
        nums[i] = nums[p];
        nums[p] = temp;
    }
}
