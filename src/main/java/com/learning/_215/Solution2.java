package com.learning._215;

import java.util.PriorityQueue;

/**
 * @Author: ZHANG
 * @Date: 2020/4/5
 * @Description: Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * <p>
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4
 * Output: 4
 */

//时间复杂度O(NLog(k))
public class Solution2 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k);
        for (int i = 0; i < k; i++) {
            priorityQueue.offer(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (priorityQueue.peek().compareTo(nums[i]) < 0) {
                priorityQueue.poll();
                priorityQueue.offer(nums[i]);
            }
        }

        return priorityQueue.poll();
    }
}
