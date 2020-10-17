package com.learning._347;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @Author: ZHANG
 * @Date: 2020/10/14
 * @Description:
 */
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(k, Comparator.comparingInt(Map.Entry::getValue));
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (queue.size() == k) {
                if (queue.peek().getValue() < entry.getValue()) {
                    queue.remove();
                    queue.add(entry);
                }
            } else {
                queue.offer(entry);
            }
        }

        int[] ints = new int[k];
        for (int i = k - 1; i > -1; i--) {
            ints[i] = queue.poll().getKey();
        }

        return ints;
    }
}
