package com.learning._746;

import java.util.HashMap;

/**
 * @Author: ZHANG
 * @Date: 2021/1/31
 * @Description:
 */
public class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int minCostClimbingStairs(int[] cost) {

        return minCostClimbingToNStairs(cost, cost.length);
    }

    private int minCostClimbingToNStairs(int[] cost, int nthStep) {
        if(map.containsKey(nthStep)) return map.get(nthStep);
        if (nthStep == 0 || nthStep == 1) return 0;

        int min = Math.min(
                cost[nthStep - 1] + minCostClimbingToNStairs(cost, nthStep - 1),
                cost[nthStep - 2] + minCostClimbingToNStairs(cost, nthStep - 2)
        );
        map.put(nthStep, min);

        return min;
    }
}
