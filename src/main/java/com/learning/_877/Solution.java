package com.learning._877;

/**
 * @Author: ZHANG
 * @Date: 2021/2/15
 * @Description: 2 <= piles.length <= 500
 * piles.length is even
 * 1 <= piles[i] <= 500
 * sum(piles) is odd
 */
public class Solution {
    public boolean stoneGame(int[] piles) {
        int sum = 0;
        for (int pile : piles) {
            sum += pile;
        }
        return stoneGame(piles, 0, piles.length - 1) * 2 > sum;
    }


    private int stoneGame(int[] piles, int l, int r) {
        if (l >= r) return 0;

        return Math.max(piles[l] + stoneGame(piles, l + 1, r), piles[r] + stoneGame(piles, l, r - 1));
    }
}
