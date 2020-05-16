package com.learning._49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2020/5/11
 * @Description: Given an array of strings, group anagrams together.
 * <p>
 * Example:
 * <p>
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 * ["ate","eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * Note:
 * <p>
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/group-anagrams
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution2 {
    private static final int[] PRIMES = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 107};

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        HashMap<Integer, Integer> freqStrToIndex = new HashMap<>();

        for (String str : strs) {
            int hash = 1;
            for (char c : str.toCharArray()) {
                hash *= PRIMES[c - 'a'];
            }

            Integer integer = freqStrToIndex.get(hash);

            if (integer == null) {
                freqStrToIndex.put(hash, res.size());
                ArrayList<String> list = new ArrayList<>();
                res.add(list);
                list.add(str);
            } else {
                res.get(freqStrToIndex.get(hash)).add(str);
            }
        }


        return res;
    }
}
