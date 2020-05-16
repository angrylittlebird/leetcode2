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
public class Solution3 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        HashMap<String, Integer> strToIndex = new HashMap<>();

        for (String str : strs) {

            int[] strArr = new int[26];
            for (char c : str.toCharArray()) {
                strArr[c - 'a']++;
            }


            //这里的排序感觉还不如直接用Arrays.sort 呢。。。
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strArr.length; i++) {
                for (int j = 0; j < strArr[i]; j++) {
                    sb.append((char) ('a' + i));
                }
            }

            Integer integer = strToIndex.get(sb.toString());
            if (integer == null) {
                strToIndex.put(sb.toString(), res.size());
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                res.add(list);
            } else {
                res.get(strToIndex.get(sb.toString())).add(str);
            }
        }


        return res;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        List<List<String>> lists = solution3.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
//        List<List<String>> lists = solution3.groupAnagrams(new String[]{"boo", "bob"});
    }
}
