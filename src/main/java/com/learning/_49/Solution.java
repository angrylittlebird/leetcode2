package com.learning._49;

import java.util.*;

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
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<FreqStr, Integer> freqStrToIndex = new HashMap<>();

        for (String str : strs) {
            FreqStr freqStr = new FreqStr(str);
            Integer integer = freqStrToIndex.get(freqStr);
            if (integer == null) {
                freqStrToIndex.put(freqStr, res.size());
                ArrayList<String> list = new ArrayList<>();
                res.add(list);
                list.add(str);
            } else {
                res.get(freqStrToIndex.get(freqStr)).add(str);
            }
        }

        return res;
    }

    class FreqStr {
        private String s;
        private HashMap<Character, Integer> freq;

        public FreqStr(String s) {
            this.s = s;
            freq = new HashMap<>();
            for (char c : s.toCharArray()) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }

        @Override
        public int hashCode() {
            int code = 0;
            for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
                code += entry.getKey() * entry.getValue();
            }
            return code;
        }

        @Override
        public boolean equals(Object obj) {
            char[] chars1 = s.toCharArray();
            Arrays.sort(chars1);
            char[] chars2 = ((FreqStr) obj).s.toCharArray();
            Arrays.sort(chars2);

            return Arrays.equals(chars1, chars2);
        }
    }
}
