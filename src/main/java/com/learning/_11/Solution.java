package com.learning._11;

/**
 * @Author: ZHANG
 * @Date: 2020/4/18
 * @Description: Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * <p>
 * Note: You may not slant the container and n is at least 2.
 * <p>
 */
public class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0, j = height.length - 1;

        while (i < j) {
            int container = Math.min(height[i], height[j]) * (j - i);
            if (container > max) max = container;

            int tempI = i, tempJ = j;
            if (height[i] < height[j]) {
                while (i < j && height[i] <= height[tempI]) i++;
            } else if (height[j] < height[i]) {
                while (j > i && height[j] <= height[tempJ]) j--;
            } else {
                while (i < j && height[i] <= height[tempI]) i++;
                while (j > i && height[j] <= height[tempJ]) j--;
            }
        }

        return max;
    }
}
