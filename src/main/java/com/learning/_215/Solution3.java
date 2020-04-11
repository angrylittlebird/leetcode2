package com.learning._215;

import java.util.Arrays;

/**
 * @Author: ZHANG
 * @Date: 2020/4/5
 * @Description: Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * <p>
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4
 * Output: 4
 */

//时间复杂度O(NLog(k))
public class Solution3 {
    public int findKthLargest(int[] nums, int k) {
//        int[] minimumHeap = new int[k];
//        for (int i = 0; i < k; i++) {
//            minimumHeap[i] = nums[i];
//            shiftUp(i, minimumHeap);
//        }

        int[] minimumHeap = Arrays.copyOf(nums, k);
        heapify(minimumHeap);

        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minimumHeap[0]) {
                minimumHeap[0] = nums[i];
                shiftDown(0, minimumHeap);
            }
        }

        return minimumHeap[0];
    }

    private int leftChildIndex(int i) {
        return 2 * i + 1;
    }

    private int rightChildIndex(int i) {
        return 2 * i + 2;
    }

    private int parentIndex(int i) {
        if (i == 0) return -1;

        return (i - 1) / 2;
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void shiftUp(int i, int[] nums) {
        if (i == 0) return;

        int current = nums[i];
        int parent = parentIndex(i);
        while (parent >= 0 && current < nums[parent]) {
            swap(i, parent, nums);
            i = parent;
            parent = parentIndex(parent);
        }
    }

    private void shiftDown2(int i, int[] nums) {
        if (leftChildIndex(i) >= nums.length) return;

        int current = nums[i];

        while (leftChildIndex(i) < nums.length) {
            if (rightChildIndex(i) < nums.length && current > nums[rightChildIndex(i)] && nums[rightChildIndex(i)] < nums[leftChildIndex(i)]) {
                swap(i, rightChildIndex(i), nums);
                i = rightChildIndex(i);
            } else if (current > nums[leftChildIndex(i)]) {
                swap(i, leftChildIndex(i), nums);
                i = leftChildIndex(i);
            } else {
                break;
            }

        }
    }

    // optimize from shiftDown2, make more easier to understand
    private void shiftDown(int i, int[] nums) {
        while (leftChildIndex(i) < nums.length) {
            int swapIndex = leftChildIndex(i);
            if (rightChildIndex(i) < nums.length && nums[rightChildIndex(i)] < nums[swapIndex]) {
                swapIndex = rightChildIndex(i);
            }

            if (nums[i] > nums[swapIndex]) {
                swap(i, swapIndex, nums);
                i = swapIndex;
            }else {
                break;
            }

        }
    }


    //时间复杂度为O(N),怎么算有点复杂。。。。。。。
    public void heapify(int[] nums) {
        int lastNotLeaveNode = parentIndex(nums.length - 1);

        int currentNodeIndex = lastNotLeaveNode;

        while (currentNodeIndex >= 0) {
            shiftDown(currentNodeIndex, nums);
            currentNodeIndex--;
        }
    }
}
