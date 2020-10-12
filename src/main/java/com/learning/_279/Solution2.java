package com.learning._279;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ZHANG
 * @Date: 2020/9/20
 * @Description:
 */
public class Solution2 {
    Map<Integer,Integer> num2Count = new HashMap();

    public int numSquares(int n) {
        return numSquaresHelper(n);
    }

    private int numSquaresHelper(int n) {
        if(num2Count.containsKey(n)) {
            return num2Count.get(n);
        }
        if (n == 0) {
            return 0;
        }

        int count = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            count = Math.min(count, numSquaresHelper(n - i * i) + 1);
        }
        num2Count.put(n, count);
        return count;
    }
}
