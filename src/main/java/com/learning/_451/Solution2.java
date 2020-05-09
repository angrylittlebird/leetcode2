package com.learning._451;

import java.util.ArrayList;

/**
 * @Author: ZHANG
 * @Date: 2020/5/9
 * @Description: Given a string, sort it in decreasing order based on the frequency of characters.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * "tree"
 * <p>
 * Output:
 * "eert"
 * <p>
 * Explanation:
 * 'e' appears twice while 'r' and 't' both appear once.
 * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 * Example 2:
 * <p>
 * Input:
 * "cccaaa"
 * <p>
 * Output:
 * "cccaaa"
 * <p>
 * Explanation:
 * Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
 * Note that "cacaca" is incorrect, as the same characters must be together.
 * Example 3:
 * <p>
 * Input:
 * "Aabb"
 * <p>
 * Output:
 * "bbAa"
 * <p>
 * Explanation:
 * "bbaA" is also a valid answer, but "Aabb" is incorrect.
 * Note that 'A' and 'a' are treated as two different characters.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-characters-by-frequency
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution2 {
    public String frequencySort(String s) {
        // index -> char; value = freq;
        int[] freq = new int[128];
        int maxFreq = 0;
        for (char c : s.toCharArray()) {
            freq[c]++;
            maxFreq = Math.max(freq[c], maxFreq);
        }

        // index -> freq; value = List<Char>
        ArrayList<Character>[] arrayLists = new ArrayList[maxFreq + 1];
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                if (arrayLists[freq[i]] == null) {
                    arrayLists[freq[i]] = new ArrayList<>();
                }
                arrayLists[freq[i]].add((char) i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = arrayLists.length - 1; i > 0; i--) {
            if (arrayLists[i] != null) {
                for (Character character : arrayLists[i]) {
                    for (int j = 0; j < i; j++) {
                        sb.append(character);
                    }
                }
            }
        }

        return sb.toString();

    }
}
