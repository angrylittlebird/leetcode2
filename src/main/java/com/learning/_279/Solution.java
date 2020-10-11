package com.learning._279;

import java.util.LinkedList;

/**
 * @Author: ZHANG
 * @Date: 2020/9/20
 * @Description:
 */
public class Solution {
    public int numSquares(int n) {
        LinkedList<Pair> queue = new LinkedList<>();
        queue.addFirst(new Pair(n, 0));

        boolean[] visited = new boolean[n + 1];
        visited[n] = true;

        while (!queue.isEmpty()) {
            Pair pair = queue.removeLast();
            int count = 1;
            while (count * count <= pair.num) {
                int num = pair.num - count * count;
                if (num == 0) return pair.step + 1;

                if (!visited[num]) {
                    queue.addFirst(new Pair(num, pair.step + 1));
                    visited[num] = true;
                }
                count++;
            }
        }
        return -1;
    }

    class Pair {
        private Integer num;
        private Integer step;

        public Pair(Integer num, Integer step) {
            this.num = num;
            this.step = step;
        }
    }
}
