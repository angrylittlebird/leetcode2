package com.learning._322;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ZHANG
 * @Date: 2021/1/24
 * @Description:
 */
public class Solution {
    Map<Integer, Integer> amount2coinChange = new HashMap<>();

    public int coinChange(int[] coins, int amount) {
        if (amount2coinChange.containsKey(amount)) return amount2coinChange.get(amount);

        if (amount == 0) return 0;
        if (amount < 0) return -1;

        Integer res = Integer.MAX_VALUE;
        for (int coin : coins) {
//            if (amount - coin < 0) continue;
            int coinChange = coinChange(coins, amount - coin);
            if (coinChange == -1) continue;
            res = Math.min(res, 1 + coinChange);
        }
        amount2coinChange.put(amount, res == Integer.MAX_VALUE ? -1 : res);

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
