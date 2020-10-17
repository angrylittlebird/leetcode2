package com.learning._123;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2020/10/13
 * @Description:
 */
public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int step = 1;
        HashSet<String> visited = new HashSet<>();
        LinkedList<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        visited.add(beginWord);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String curWord = queue.remove();

                for (String word : wordList) {
                    if (visited.contains(word)) continue;

                    boolean flag = canTransformed(curWord, word);

                    if (flag && word.equals(endWord)) return step + 1;

                    if (flag) {
                        queue.offer(word);
                        visited.add(word);
                    }
                }
            }
            step++;
        }

        return 0;
    }

    private boolean canTransformed(String word1, String word2) {
        boolean missedOnce = false;
        for (int i = 0; i < word1.length(); i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            if (c1 != c2) {
                if (missedOnce) return false;
                missedOnce = true;
            }
        }
        return true;
    }

}
