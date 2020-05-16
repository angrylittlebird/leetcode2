package com.learning._447;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ZHANG
 * @Date: 2020/5/13
 * @Description: Given n points in the plane that are all pairwise distinct,
 * a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).
 * <p>
 * Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).
 * <p>
 * Example:
 * <p>
 * Input:
 * [[0,0],[1,0],[2,0]]
 * <p>
 * Output:
 * 2
 * <p>
 * Explanation:
 * The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-boomerangs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            HashMap<Double, Integer> distanceToFreq = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i != j)
                    distanceToFreq.put(distance(points[i], points[j]), distanceToFreq.getOrDefault(distance(points[i], points[j]), 0) + 1);
            }
            for (Map.Entry<Double, Integer> entry : distanceToFreq.entrySet()) {
                if (entry.getValue() > 1) {
                    res += entry.getValue() * (entry.getValue() - 1);
                }
            }
        }

        return res;
    }


    private double distance(int[] a, int b[]) {
        return Math.pow(a[0] - b[0], 2) + Math.pow(a[1] - b[1], 2);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
//        int factorial = solution.factorial(3);
//        assert factorial == 6;
//        factorial = solution.factorial(4);
//        assert factorial == 24;
//
//        double distance = solution.distance(new int[]{1, 2}, new int[]{2, 4});
//        assert distance == 5;

        int i = solution.numberOfBoomerangs(new int[][]{new int[]{0, 0}, new int[]{1, 0}, new int[]{-1, 0}, new int[]{0, 1}, new int[]{0, -1}});
        System.out.println(i);

    }
}
